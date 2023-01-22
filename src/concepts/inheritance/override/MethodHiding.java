package concepts.inheritance.override;

class PS{
    public static void  m1(){
        System.out.println("Parent m1");
    }
}
class CS extends PS {
    public static void  m1(){
        System.out.println("Child m1");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        PS parent=new PS();
        parent.m1();
        CS child=new CS();
        child.m1();
        PS parentChild=new CS(); //In static reference is considered,ana non-static runtime object is considered
        parentChild.m1();
    }
}

/*
Parent m1
Child m1
Parent m1
 */