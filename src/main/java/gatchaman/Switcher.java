package gatchaman;

public class Switcher {
    private Integer a;
    private Integer b;

    public Switcher(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    
    public Switcher switchVariables() {
        b = a + b;
        a = -( a - b );
        b = b - a;
        return this;
    }

    @Override
    public String toString() {
        return  "a=" + a +
                " b=" + b;
    }
}
