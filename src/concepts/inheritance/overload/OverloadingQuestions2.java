package concepts.inheritance.overload;

public class OverloadingQuestions2 {
    static void m1(Integer i){
        System.out.println("general Called");
    }
    static void m1(Integer... i){
        System.out.println("var args Called");
    }

    public static void main(String[] args) {
       m1();
       m1(1,1);
       m1(1);
    }
}
/*
var args Called
var args Called
general Called
 */
