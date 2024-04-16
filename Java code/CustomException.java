
class MyCustomException extends Exception 
{
    public MyCustomException(String str) 
    {
        super(str);
    }
}

public class CustomException 
{
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0 )
            // throw new MyCustomException("I don't want to print zero ");
            throw new PranathiException("I don't want to print zero ");

        } 
        catch(PranathiException e)
        {
            j = 18 / 1;
            System.out.println("that's the default output: " + e);
  
        }
        // catch (MyCustomException e) {
        //     j = 18 / 1;
        //     System.out.println("that's the default output: " + e);
        // }

        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
    
