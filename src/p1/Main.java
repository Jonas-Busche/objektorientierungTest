package p1;

public class Main {
    public static void main(String[] args) {

        Calculator.getTutorial();

        Calculator calculator1 = new Calculator("T1");
        Calculator calculator2 = new Calculator("T2");

        System.out.print(calculator1.getName() + ": ");
        System.out.println(calculator1.add(2,5));

        System.out.print(calculator2.getName() + ": ");
        System.out.println(calculator2.add(2,4));

        System.out.print(calculator1.getName() + ": ");
        System.out.println(calculator1.getLastResult());

        System.out.print(calculator2.getName() + ": ");
        System.out.println(calculator2.getLastResult());

        calculator1.test();

        StaticTest.test();

        Calculator.s = "hahahaha";
        System.out.println(Calculator.s);

    }
}


