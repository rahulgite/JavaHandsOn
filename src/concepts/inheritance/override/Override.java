package concepts.inheritance.override;

class Parent{
    public void  m1(){
        System.out.println("Parent m1");
    }
}
class Child extends Parent {
    public void  m1(){
        System.out.println("Child m1");
    }
}
public class Override {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.m1();
        Child child=new Child();
        child.m1();
        Parent parentChild=new Child();
        parentChild.m1();
    }
}

/*
Parent m1
Child m1
Child m1
 */
