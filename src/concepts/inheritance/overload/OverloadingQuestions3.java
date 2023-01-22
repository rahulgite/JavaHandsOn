package concepts.inheritance.overload;

public class OverloadingQuestions3 {
    static void m1(Integer i,Float f){
        System.out.println("1st Called");
    }
    static void m1(Float f,Integer i){
        System.out.println("2nd Called");
    }

    public static void main(String[] args) {
       m1(1,1f);
       m1(1f,1);
      // m1(1,1);
        /* java: no suitable method found for m1(int,int)
        method concepts.inheritance.overload.OverloadingQuestions3.m1(java.lang.Integer,java.lang.Float) is not applicable
                (argument mismatch; int cannot be converted to java.lang.Float)
        method concepts.inheritance.overload.OverloadingQuestions3.m1(java.lang.Float,java.lang.Integer) is not applicable
                (argument mismatch; int cannot be converted to java.lang.Float)
                */
    }
}
/*
1st Called
2nd Called
 */
