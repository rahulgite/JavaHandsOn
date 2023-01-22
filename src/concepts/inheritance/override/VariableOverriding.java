package concepts.inheritance.override;

class PS1{
    int i=0;
    public static void  m1(){
        System.out.println("Parent m1");
    }
}
class CS1 extends PS1 {
    int i=1;
    public static void  m1(){
        System.out.println("Child m1");
    }
}
public class VariableOverriding {
    public static void main(String[] args) {
        PS1 parent=new PS1();
        System.out.println(parent.i);
        CS1 child=new CS1();
        System.out.println(child.i);
        PS1 parentChild=new CS1();
        System.out.println(parentChild.i);
    }
}

/*
Overriding only applies to method, so resolution will be done by compiler wrt reference
0
1
0
 */