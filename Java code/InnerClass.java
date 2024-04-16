// class A
// {
//     int age;
//     public void show()
//     {
//         System.out.println("In Show");
//     }

//     class B //A$B.class ==> this says B class belongs to A class
//     {
//         public void config()
//         {
//             System.out.println("In Config");
//         }
//     }
// }


class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

// class B extends A
// {
//     public void show()
//     {
//         System.out.println("In B Show");
//     }
// }

public class InnerClass {
    public static void main(String[] args) {

        A obj = new A()
        {
            // Inner class as well as Anonymous class
            public void show()
            {
                System.out.println("In New Show");
            }
        };
        obj.show();

        // A.B obj1 = obj.new B(); //creating object for inner class
        // obj1.config();
        
        
    }
    
}
