//try, catch, throws, finally, throw

public class ExceptionHandling {
    public static void main(String[] args) {

        int i = 20; //normal statement
        int j = 0;
        
        int nums[] = new int[5];

        String str = null;
        // String s1 = "pranathi";
        // int k = Integer.parseInt(s1); // NumberFormat Exception
    
        try
        {
              j = 8/i; //critical statement // arithemetic exception
              if(j == 0)
                throw new ArithmeticException();

            //   System.out.println(nums[1]);
            //   System.out.println(nums[6]);  // array index out of bound exception
            //   System.out.println(str.length()); // null pointer exception
        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Inex out of bound");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong -> " +e);
        }

        System.out.println(j);
        
        System.out.println("Bye");
    }
    
}
