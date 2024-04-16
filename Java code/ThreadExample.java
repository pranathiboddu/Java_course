//if you want to execute two things/methods at same time we use Threads
// use can use Threads by extending Thread class and implementing Runnable interface
// we need to start the method , then it calls the run method
//priority - min, norm , max

// class Welcome implements Runnable
// {

//     @Override
//     public void run() 
//     {
//         for (int i = 1; i <= 10; i++) 
//         {
//             System.out.println("Welcome Pranathi");
//             try 
//             {
//                 Thread.sleep(10);
//             } 
//             catch (InterruptedException e) 
//             {
//                 e.printStackTrace();
//             }
//         }

//     }

// } 

class WelcomePeople implements Runnable
{

    @Override
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Welcome People by Pranathi");
            try 
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

    }

} 
/* 
class Hi extends Thread {
    // public void show()
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi Pranathi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Hello extends Thread {
    // public void show()
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello Pranathi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
*/

public class ThreadExample {

    public static void main(String[] args) 
    {
        // Hi obj1 = new Hi();
        // Hello obj2 = new Hello();

        // obj2.setPriority(Thread.MAX_PRIORITY); // set priority

        // obj1.start();
        // obj2.start();

        // Welcome w1 = new Welcome();
        // Runnable w1 = new Welcome();
        Runnable w1 = () ->
        {
            for (int i = 1; i <= 10; i++) 
            {
                System.out.println("Welcome Pranathi");
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace(); }
            }
        };

        Thread t1 = new Thread(w1);
        t1.start();

        // WelcomePeople w2 = new WelcomePeople();
        Runnable w2 = new WelcomePeople();
        Thread t2 = new Thread(w2);
        t2.start();

        // obj1.show();
        // obj2.show();


    }

}
