class Calc
{
    public int  add(int n1, int n2)
    {
        return n1+n2;
    }

    public void config()
    {
        System.out.println("In A Config");       
    }

}

class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
    public void show()
    {
        System.out.println("In B Show");       
    }


}


public class MethodOverriding {

    public static void main(String[] args) {
        
        {
            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(3,7);
            System.out.println(r1);
            obj.show();
            obj.config();
        }
    }
    
}
