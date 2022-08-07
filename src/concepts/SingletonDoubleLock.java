package concepts;

import java.io.Serializable;

public class SingletonDoubleLock {
    public static void main(String[] args) {
        Thread1 o1=new Thread1();
        Thread2 o2=new Thread2();

        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);

        t1.start();
        t2.start();
    }
}
class Singleton1 implements Serializable {

    private static Singleton1 singleton;

    public int i = 1;

    private Singleton1() {
        System.out.println("Instance Created");
    }

    public static Singleton1 getInstance( ) {
        if(singleton==null){
            //synchronized (concepts.Singleton1.class){
                if(singleton==null){
                    singleton=new Singleton1();
                }
           // }
        }
        return singleton;
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        Singleton1.getInstance();
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        Singleton1.getInstance();
    }
}

/*
Without Synchronized
Instance Created
Instance Created

With Synchronized
Instance Created
 */
