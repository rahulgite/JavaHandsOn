package concepts.inheritance.overload;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));  // Output: 3
        System.out.println(calc.add(1.5, 2.5));  // Output: 4.0
        System.out.println(calc.add(1, 2, 3));  // Output: 6
        // Automatic promotion of datatype char to integer
        // byte-> short-> int -> long-> float-> double

        //char to int
        System.out.println(calc.add('a', 'b'));  // Output: 195
        System.out.println(calc.add('a', 'b'));  // Output: 195

    }
}
