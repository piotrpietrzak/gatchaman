package gatchaman

class Priviledge {
    List<User> users = [];
    List<Operation> operations = [];

    Priviledge leftShift(final User user) {
        users << user
        this
    }

    Priviledge leftShift(final Operation operation) {
        operations << operation
        this
    }
}
