package gatchaman

import spock.lang.Specification

class PriviledgeSpec extends Specification {

    def "should add operation for user"() {
        setup:
        Priviledge priviledge = new Priviledge()
        User user = new User(name: 'Test name')
        Operation operation = new Operation(name: 'Test operation')

        when:
        priviledge << user << operation

        then:
        priviledge.users.contains user
        priviledge.operations.contains operation
    }
}
