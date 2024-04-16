class A
{
    public A()
    {
        super(); //by default this method is mentioned in every constructor even though we do not mention
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    // if we want to call constructor of A and
    //Constructor of B and parametrized constructor of B 
    //we can use this() method which calls constructor od current class

    public B(int n)
    {
        //super();
        this();
        System.out.println("In B int");
    }
}

public class SuperaAndThisExample {

    public static void main(String[] args)
     {
        //B b1= new B(); 
        B b1= new B(6);
    }
    
}
