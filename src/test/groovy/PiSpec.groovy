import gatchaman.DefiniteIntegral
import spock.lang.Specification

class PiSpec extends Specification {
    def "should converge to pi"(scale, sumToLimit, expectedResult) {
        expect:
        DefiniteIntegral integral = new DefiniteIntegral(scale, sumToLimit);
        integral.compute({ Math.sin(it) });
        integral.upperLimit == expectedResult

        where:
        scale | sumToLimit | expectedResult
        1     | 1          | 3.2
        2     | 1          | 3.14
        3     | 1          | 3.142
        4     | 1          | 3.1416
        5     | 1          | 3.14160
        6     | 1          | 3.141592
    }
}
