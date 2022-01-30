class Table
{
    int balance=1000;
     void withdraw(){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName());
                System.out.println(balance-=i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }

    }//end of the method
    void add(){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName());
                System.out.println(balance+=200);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.withdraw();
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.add();
    }
}

public class SynchronizedExamples{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

/*
Thread-0
999
Thread-0
997
Thread-0
994
Thread-0
990
Thread-0
985
Thread-1
1185
Thread-1
1385
Thread-1
1585
Thread-1
1785
Thread-1
1985

Process finished with exit code 0

 */
