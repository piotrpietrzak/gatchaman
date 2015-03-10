package gatchaman

class DefiniteIntegral {
    BigDecimal upperLimit = 0
    BigDecimal integrateTo = 0
    BigDecimal step = 1

    DefiniteIntegral(Integer scale, BigDecimal integrateTo) {
        this.step = BigDecimal.valueOf(1,scale)
        this.integrateTo = integrateTo
    }

    BigDecimal compute( Closure<BigDecimal> function) {
        BigDecimal sum = 0;
        BigDecimal x = 0;

        while (sum < integrateTo) {
            x += step
            sum += function(x) * step
        }
        this.upperLimit = x * 2
    }

}
