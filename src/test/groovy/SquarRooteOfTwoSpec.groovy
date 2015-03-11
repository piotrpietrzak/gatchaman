import gatchaman.IntegrationClosure
import spock.lang.Specification

class SquarRooteOfTwoSpec extends Specification {
    def "should converge to square root of two"(scale, sumToLimit, expectedResult) {
        expect:
        new IntegrationClosure().compute(scale, sumToLimit , { it }) == expectedResult

        where:
        scale | sumToLimit | expectedResult
        1     | 1          | 1.4
        2     | 1          | 1.41
        3     | 1          | 1.414
        4     | 1          | 1.4142
        5     | 1          | 1.41421
        6     | 1          | 1.414214
    }
}
