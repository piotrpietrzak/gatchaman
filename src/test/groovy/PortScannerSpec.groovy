import gatchaman.AvailablePortScanner
import gatchaman.Server
import spock.lang.Specification

class PortScannerSpec extends Specification {

    def "Scan for available port to bind server on this port"() {
        def minPort = 8080

        def maxPort = 10000
        when:
        Server server = new AvailablePortScanner(minPort, maxPort).tryToExecuteWithFreePort(new Closure<Server>(this) {
            @Override
            public Server call(Object... args) {
                Integer freePort = (Integer) args[0];
                Server server = new Server(freePort);
                System.setProperty("port", freePort.toString());
                return server;
            }
        });
        then:
        server !=null
        server.with {
            port <= maxPort
            port >= minPort
        }
    }
}
