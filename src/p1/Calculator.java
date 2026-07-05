package p1;

public class Calculator {

    private String name;
    protected int lastResult;
    public static String s = "Taschenrechner";

    public Calculator(String const_name) {
        this.name = const_name;
    }

    public int add(int a, int b) {
        lastResult =  a + b;
        return lastResult;
    }

    public int getLastResult() {
        return lastResult;
    }

    public void test() {
        System.out.println("Test: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getTutorial() {
        System.out.println("Um einen Taschenrechner zu erstellen nutze das \"new\" keyword");
    }
}


