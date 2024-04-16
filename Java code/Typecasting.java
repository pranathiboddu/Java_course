class A
{
    public void show1()
    {
        System.out.println("In show A");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In show B");    
    }
}


public class Typecasting {
    public static void main(String[] args) {

        double d = 4.5;
        int i =(int) d; //typecasting

        System.out.println(i);

        A a = new A();
        a.show1();

        A a1 = (A) new B(); //upcasting
        a1.show1();

        A obj = new B(); 
        obj.show1();

        B obj1 = (B) obj; // downcasting
        obj1.show2();
        
    }
    
}
