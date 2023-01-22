package concepts.inheritance;


class SuperClass {
    public void m1() {
        System.out.println("Superclass m1 method");
    }
}
class SubClass extends SuperClass {
    public void m2() {
        System.out.println("Subclass m2 method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("\n Parent to Parent :");
        SuperClass superClass=new SuperClass();
        superClass.m1();
        System.out.println("\n Parent to child :");
        SuperClass superClass1=new SubClass();
        superClass1.m1();
        //superClass1.m2();
        System.out.println("\n Child to child :");
        SubClass subClass=new SubClass();
        superClass.m1();
        subClass.m2();
    }
}
