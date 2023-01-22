package concepts.inheritance.override;

class P{
    public Object  m1(){
        System.out.println("Parent m1");
        return null;
    }
}
class C extends P {
    public String  m1(){
        System.out.println("Child m1");
        return null;
    }
}
public class OverrideCovariant {
    public static void main(String[] args) {
        P parent=new P();
        parent.m1();
        C child=new C();
        child.m1();
        P parentChild=new C();
        parentChild.m1();
    }
}

/* incase parent has child as return type
  return type java.lang.Object is not compatible with java.lang.String
 */