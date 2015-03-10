import gatchaman.DefiniteIntegral
import spock.lang.Specification

class PiSpec extends Specification {
    def "should converge to pi"(scale, sumToLimit, expectedResult) {
        expect:
        new DefiniteIntegral()
                .compute(scale, sumToLimit, { Math.sin(it) }) * 2 == expectedResult

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
