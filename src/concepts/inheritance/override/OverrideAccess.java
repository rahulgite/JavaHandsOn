package concepts.inheritance.override;

class P1{
    public void  m1(){
        System.out.println("Parent m1");
    }
    protected void  m2(){
        System.out.println("Parent m1");
    }
}
class C1 extends P1 {
   // protected String  m1(){
    /*
     java: m1() in concepts.inheritance.override.C1 cannot override m1() in concepts.inheritance.override.P1
  attempting to assign weaker access privileges; was public
     */
    public void  m1(){
        System.out.println("Child m1");
    }
    public void  m2(){
        System.out.println("Child m1");
    }
}
public class OverrideAccess {
    public static void main(String[] args) {
        P1 parent=new P1();
        parent.m1();
        C1 child=new C1();
        child.m1();
        P1 parentChild=new C1();
        parentChild.m1();
    }
}

/*
private < default < protected < public

same scope or increasing scope is valid

 Parent m1
Child m1
Child m1
 */