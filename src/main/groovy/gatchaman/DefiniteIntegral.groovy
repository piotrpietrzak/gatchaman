package gatchaman

class DefiniteIntegral {
    BigDecimal upperLimit = 0

    BigDecimal compute( Integer scale, BigDecimal integrateTo, Closure<BigDecimal> function) {
        BigDecimal sum = 0;
        BigDecimal x = 0;
        BigDecimal step = BigDecimal.valueOf(1,scale)

        while (sum < integrateTo) {
            x += step
            sum += function(x) * step
        }
        this.upperLimit = x
    }

}
