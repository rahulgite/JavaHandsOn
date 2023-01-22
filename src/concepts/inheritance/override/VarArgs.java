package concepts.inheritance.override;
class P2{
    public static void  m1(int... i){
        System.out.println("Parent m1");
    }
}
class C2 extends P2 {
    public static void  m1(int i){
        System.out.println("Child m1");
    }
}
public class VarArgs {
    public static void main(String[] args) {
        P2 parent=new P2();
        parent.m1(10);
        C2 child=new C2();
        child.m1(10);
        P2 parentChild=new C2(); //Since its overloading m1 , so reference will be considered.
        parentChild.m1(10);
    }
}
/*
Parent m1
Child m1
Parent m1
 */
