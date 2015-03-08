package gatchaman

class AvailablePortScanner {
    Integer firstDesired, lastDesired;
    AvailablePortScanner(Integer firstDesired, Integer lastDesired) {
        this.firstDesired = firstDesired
        this.lastDesired = lastDesired
    }

    Server tryToExecuteWithFreePort(Closure<Server> serverClosure) {
        serverClosure.call(findAvailablePort());
    }

    private Integer findAvailablePort() {
        Math.round(Math.random() * (lastDesired - firstDesired) + firstDesired)
    }
}
