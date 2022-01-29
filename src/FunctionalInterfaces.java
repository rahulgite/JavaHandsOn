import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

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
        System.out.println("Bi-Function"+biFunction.apply(20,30));




    }
}
