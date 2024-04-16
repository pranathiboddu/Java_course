//By default enum in java extends Enum class

enum Status{
    Running,Failed,Pending,Success;
}

enum Laptop 
{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}
public class Enum {
    
    public static void main(String[] args) {
        
        Status s = Status.Running;
        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        for(Status s1 : ss)
        {
        System.out.println(s1 +" - " + s1.ordinal());
        }

        Status s2 = Status.Pending;

        switch(s2)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop laps : Laptop.values())
        {
            System.out.println(laps + " : " + laps.getPrice());
        }
    }
}
