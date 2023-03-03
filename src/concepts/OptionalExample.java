package concepts;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional1 = Optional.ofNullable("Rahul");

        System.out.println("isPresent() :" + optional.isPresent());
        optional.ifPresent(a -> System.out.println("ifPresent(): " + a));
        optional1.ifPresent(a -> System.out.println("ifPresent() :" + a));
        System.out.println("get() :" + optional1.get());
        System.out.println("equals() :" + optional.equals(optional1));
        System.out.println("orElse() :" + optional.orElse("Hello"));
        System.out.println("orElse() :" + optional1.orElse("Hello"));
        System.out.println("orElseGet() :" + optional.orElseGet(() -> "Gite"));
        System.out.println("orElseGet() :" + optional1.orElseGet(() -> "Gite"));
        System.out.println(optional.hashCode());
        System.out.println("filter() :" + optional1.filter(a -> a.length() > 0).orElse("String not qualified"));
        System.out.println("orElseThrow() :" + optional1.orElseThrow(() -> new NullPointerException("No value")));
        System.out.println("orElseThrow() :" + optional.orElseThrow(() -> new NullPointerException("No value")));
    }
}

/*
isPresent() :false
ifPresent() :Rahul
get() :Rahul
equals() :false
orElse() :Hello
orElse() :Rahul
orElseGet() :Gite
orElseGet() :Rahul
0
filter() :Rahul
orElseThrow() :Rahul
Exception in thread "main" java.lang.NullPointerException: No value
	at concepts.OptionalExample.lambda$main$6(OptionalExample.java:22)
	at java.util.Optional.orElseThrow(Optional.java:290)
	at concepts.OptionalExample.main(OptionalExample.java:22)

 */