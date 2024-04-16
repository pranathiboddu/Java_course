public class WrapperClass {

    public static void main(String[] args) {
        
        int num = 9;
        Integer num1 = num; // autoboxing - convert primitive to object

        System.out.println(num1);

        int num2 = num1; //unboxing  - convert object to primitive
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 5);

        int num4 = 7;
        String str1 = String.valueOf(num4);
        System.out.println(str1.length());

    }
    
}
