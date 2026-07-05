package p1;

public class ExtremeCalculator extends Calculator {
    public ExtremeCalculator(String const_name) {
        super(const_name);
    }

    public int substract(int a, int b) {
        lastResult = a - b;
        return lastResult;
    }
}
