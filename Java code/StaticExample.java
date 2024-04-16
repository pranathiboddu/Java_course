class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name ="Phone";
        System.out.println("Inside static block");
    }

    public Mobile()
    {
        brand ="";
        price = 200;
        System.out.println("Inside Constructor block");

    }
    public void show() {
        System.out.println(brand + " : " +  price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println("In Static method");
        System.out.println(obj.brand + " : " +  obj.price + " : " + name);
    }
}

class StaticExample {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class.forName("Mobile");
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 13000;
        // Mobile.name = "Smart Phone";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 10000;
        // Mobile.name = "Smart Phone";

        m1.show();
        m2.show();
        
        Mobile.show1(m1);
    }
}