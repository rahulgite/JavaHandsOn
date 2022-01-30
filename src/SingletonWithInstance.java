public class SingletonWithInstance {
    public static void main(String[] args) {
        ABC a1= ABC.INSTANCE;
        ABC a2= ABC.INSTANCE;
        a1.i=10;
        a1.show(); // a1 with 10
        a2.i=20;
        a1.show(); // a1 with 20, proves its using singleton.
    }
}
enum ABC{
    INSTANCE; //has private constructor and public getInstance method
    int i;
    void show(){
        System.out.println(i);
    }
}
