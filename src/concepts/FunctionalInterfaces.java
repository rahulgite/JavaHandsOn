package concepts;

import java.util.function.*;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Predicates
        Predicate<String> checkLength= str -> str.length() > 5;
        Predicate<String> checkEven= str -> str.length()%2 == 0;

        System.out.println("Length check is greater than 5? "+ checkLength.test("rahulgite.com"));
        // Predicate Chaining
        System.out.println("Length check if its greater than 5 and its even? "+ checkLength.and(checkEven).test("rahulgite.com")); //false
        System.out.println("Length check if its greater than 5 or its even? "+ checkLength.or(checkEven).test("rahulgite.com")); //true
        System.out.println("Negate Length check if its greater than 5? "+ checkLength.negate().test("rahulgite.com")); //false

        //Bi-Predicate
        BiPredicate<Integer,Integer> bi1=(i,j)->i*j>100;
        System.out.println(bi1.test(5,6)); //false

        // Functions

        Function<Integer,Integer> square= i->i*i;
        Function<Integer,Integer> cube= i->i*i*i;

        System.out.println("\n\nSquare using Function "+ square.apply(5));
        System.out.println("Cube using Function "+ cube.apply(5));
        // Function Chaining
        System.out.println("Square of Cube using Function "+ square.andThen(cube).apply(5));
        System.out.println("Cube of Square using Function "+ square.compose(cube).apply(5));

        //BiFunction
        BiFunction<Integer,Integer,Integer> biFunction=(i,j)-> i*j;
        System.out.println("Bi-Function"+biFunction.apply(20,30)+"\n\n");

        // Consumer
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);

        // Supplier
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;


        System.out.println("\n\nSupplier \n"+doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());

    }
}
/*
OUTPUT

Length check is greater than 5? true
Length check if its greater than 5 and its even? false
Length check if its greater than 5 or its even? true
Negate Length check if its greater than 5? false
false


Square using Function 25
Cube using Function 125
Square of Cube using Function 15625
Cube of Square using Function 15625
Bi-Function600


Sydney
Dhaka
New York
London


Supplier
0.03745314000185629
0.1778147221571662

Process finished with exit code 0

 */