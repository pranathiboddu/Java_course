///Threads with mutation is gives instability , if you need to work with mutation
//be it a thread safe 
// thread safe can be acheived by using synchronized - it calls only one method at a time
class Counter {
    int count;
    public synchronized void increment() 
    {
        count++;
    }
}

public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }

        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }

}
