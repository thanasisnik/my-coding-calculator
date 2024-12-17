package gr.aueb.cf.calc;

public class Main {

    public static void main(String[] args) {

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        try {
            return  a / b;
        } catch (ArithmeticException e){
            System.out.println("Error Denominator must not be zero.");
            throw e;
        }
    }

    public static int mul (int a, int b){
        return a * b;
    }
}
