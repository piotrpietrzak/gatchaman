package gatchaman

import spock.lang.Specification
import spock.lang.Unroll


class SwitchWithAddSpec extends Specification {

    @Unroll
    def "should switch variables (#a,#b) without additional variable"() {
        def switcher = new Switcher(a, b)
        expect:
            result.equals(switcher.switchVariables().toString());
        where:
            a                 | b   | result
            1                 | 2   | "a=2 b=1"
            10                | 20  | "a=20 b=10"
            -10               | -20 | "a=-20 b=-10"
            20                | 10  | "a=10 b=20"
            -20               | -10 | "a=-10 b=-20"
            0                 | 10  | "a=10 b=0"
            10                | 0   | "a=0 b=10"
            -10               | 0   | "a=0 b=-10"
            0                 | 0   | "a=0 b=0"
            0                 | -1  | "a=-1 b=0"
            10                | 10  | "a=10 b=10"
            Integer.MAX_VALUE | 10  | "a=10 b="+Integer.MAX_VALUE

    }
}