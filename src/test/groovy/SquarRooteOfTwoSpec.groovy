import spock.lang.Specification

import static gatchaman.IntegrationClosure.*

class SquarRooteOfTwoSpec extends Specification {
    def "should converge to square root of two"(scale, sumToLimit, expectedResult) {
        expect:
        Closure<BigDecimal> functionToIntegrate = { it }
        integrate(scale, sumToLimit , functionToIntegrate) == expectedResult

        where:
        scale | sumToLimit | expectedResult
        1     | 1          | 1.4
        2     | 1          | 1.41
        3     | 1          | 1.414
        4     | 1          | 1.4142
        5     | 1          | 1.41421
        6     | 1          | 1.414214
        7     | 1          | 1.4142136
        8     | 1          | 1.41421356
    }
}
