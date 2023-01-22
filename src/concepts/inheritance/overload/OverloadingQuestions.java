package concepts.inheritance.overload;

public class OverloadingQuestions {
    static void m1(Object o){
        System.out.println("Object Called");
    }
    static void m1(String o){
        System.out.println("String Called");
    }
    static void m1(Integer o){
        System.out.println("Integer Called");
    }

    public static void main(String[] args) {
        System.out.println(">> String Passed");
        m1("test");
        System.out.println(">> String Object Passed");
        m1(new String("test"));
        System.out.println(">> int Passed");
        m1(1);
        System.out.println(">> Integer Object Passed");
        m1(new Integer(1));
        System.out.println(">> Object Passed");
        m1(new Object());
        System.out.println(">> null Passed");
        //m1(null);
        //java: reference to m1 is ambiguous
        //  both method m1(java.lang.String) in concepts.inheritance.overload.OverloadingQuestions and
        //  method m1(java.lang.Integer) in concepts.inheritance.overload.OverloadingQuestions match

        /*
        Priority
        1) Exact Match
        2) Child Class
        3) Parent Class
         */


    }
}
/*
>> String Passed
String Called
>> String Object Passed
String Called
>> int Passed
Integer Called
>> Integer Object Passed
Integer Called
>> Object Passed
Object Called
>> null Passed
java: reference to m1 is ambiguous
        both method m1(java.lang.String) in concepts.inheritance.overload.OverloadingQuestions and
        method m1(java.lang.Integer) in concepts.inheritance.overload.OverloadingQuestions match
 */
