class Laptop
{
     String model;
     int price;

     @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
}

public class ObjectClassExample {

    public static void main(String[] args) {

    Laptop obj= new Laptop();

    obj.model ="Lenovo Yoga";
    obj.price = 1000;

    System.out.println(obj);
    // when you try to print the object by default it will call toString() method of object class even ou don't mention it
    // but if you create toString() method in you class it gets overrided and print/ get the data 

    // if you don't define the methods it will call  methods from obect class but if you define methods inside your class , it will get overrided and it will use the method defined inside your class
        
    }
    
}
