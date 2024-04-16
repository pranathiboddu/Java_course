//Abstract class can have abstract methods as well as non abstract methods
//but if method is an abstract method , class should be also defined as abstract
//we cannot create object for an abstract class
//abstract keyword is used to declare a method

abstract class Car //abstract class
{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

class WagonR extends Car // concrete class
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        //Car obj = new Car();// you cannnot create object of abstract class
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        
    }
}
