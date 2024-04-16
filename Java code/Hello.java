class Hello{
    
    public static void main(String args[])
    {
        System.out.println("Hello World");

        int num = 3;
        System.out.println(num);

        int num1 = 3;
        int num2 = 7;
        int result = num1 + num2;

        System.out.println(result);

        // primitive data types

        int n = 8;
        byte by = 127;
        short sh = 339;
        long l = 5679l;

        float f = 4.7f;
        double d= 4.7;

        char c = 'p';
        char c1 ='8';
        boolean bool = true;

        //Typecasting

        byte b = 127;
        int a = 257;
        byte k = (byte) a;

        System.out.println(k);

        int m = 2;

        switch(m)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
                
        }

        //while loop
        int z = 0;
        while(z < 5 )
        {
            System.out.println("I am in while");
            z++;
        }

        //for loop

    }
}
