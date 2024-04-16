class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In Show A");
    }
}

class B extends A
{
    @Override //annotation 
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In Show B");
    }
}

public class Annotations {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        
    }
}
