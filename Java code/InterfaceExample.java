// interface is not a class
//by default methods in interface ara public and abstract
//interface variables are public,static, final by default 
//interface don't have memory in heap

// class - class  -> extends
// class - interface -> implemnts
// interface - interface -> extends

interface A
{
    int age =44;  //final and static
    String area ="hyd";

    void show(); //==> represents public abstract void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X // interface to interface use extends
{

}

class B implements A,X // class to interface use implements
{

    public void show()
    {
        System.out.println("In show B");
    }
    public void config()
    {
        System.out.println("In Config B");
    }
    public void run() 
    {
        System.out.println("In run B");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {

       // B obj = new B();
        A obj = new B();
        obj.config();
        obj.show();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.age + "," + A.area);
        
    }
    
}
