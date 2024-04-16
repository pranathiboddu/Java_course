class Calculator{

    public int add(int num1,int num2)
    {
        int r = num1+num2;
        return r;
    }
}
public class Demo{
    public static void main(String args[])
    {
        // int num1 =4;
        // int num2 =5;

        // int result = num1+num2;
        Calculator  c = new Calculator();
        int result = c.add(5,7);
        System.out.println(result);

    }
}