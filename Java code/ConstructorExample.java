class Human{

    private int age;
    private String name;

    //constructor is special method which has method name same as class name 
    // every time you create the object constructor is called
    public Human()
    {
        System.out.println("Inside Constructor");
        age = 11;
        name ="pranathi";
    }

    public Human(int age, String name)
    {
        this.age=age;
        this.name=name;        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class ConstructorExample {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 =  new Human(26,"krishna");

        // Human h2 = new Human();

        // h1.setAge(11);
        // h1.setName("pranathi");

        
        System.out.println(h1.getName() + " : " + h1.getAge());
        System.out.println(h2.getName() + " : " + h2.getAge());

        System.out.println(h2);


    }
    
}
