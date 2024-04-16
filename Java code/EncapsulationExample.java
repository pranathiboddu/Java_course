class Human {
    // all the data stored in form of variables
    // binding or wrapping data into single unit - encapsulation
    // binding the data with the methods
    

    // private int age = 11;
    // private String name ="pranathi";

    private int age;
    private String name;

 
    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int a) {
    //     age = a;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String n) {
    //     name = n;
    // }

    //this keyword - reference variable refers to current object 

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}

public class EncapsulationExample {
    public static void main(String[] args) {

        Human h1 = new Human();
        // h1.age =11;
        // h1.name="pranathi";

        h1.setAge(11);
        h1.setName("pranathi");

        System.out.println(h1.getName() + " : " + h1.getAge());

    }

}
