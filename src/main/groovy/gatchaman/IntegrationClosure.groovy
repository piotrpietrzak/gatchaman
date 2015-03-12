package gatchaman

class IntegrationClosure {
    static final Closure<BigInteger> integrate = {
        Integer scale, BigDecimal integrateTo, Closure<BigDecimal> function ->
            BigDecimal sum = 0;
            BigDecimal x = 0;
            BigDecimal step = BigDecimal.valueOf(1, scale)

            while (sum < integrateTo) {
                x += step
                sum += function(x) * step
            }
            x
    }
}
