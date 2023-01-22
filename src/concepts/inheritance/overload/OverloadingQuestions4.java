package concepts.inheritance.overload;
class Parent{
}
class Child extends Parent{
}
public class OverloadingQuestions4 {
    public void m1(Parent p){
        System.out.println("Parent Called ");
    }
    public void m1(Child p){
        System.out.println("Child Called ");
    }
    public static void main(String[] args) {
        Parent parent=new Parent();
        Child child=new Child();
        Parent parentChild=new Child();

        OverloadingQuestions4 o=new OverloadingQuestions4();
        o.m1(parent);
        o.m1(child);
        o.m1(parentChild); // Reference will get change, Compile time reference is checked.

    }
}
/*
Parent Called
Child Called
Parent Called
 */
