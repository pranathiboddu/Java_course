class Patterns{
    public static void main(String args[])
    {
          
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"); 
            }

            System.out.println();           
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        for(int i =1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " " );
            }
            System.out.println();
        }

        for(int i =0;i<5;i++)
        {
            for(int j =0;j<5;j++)
            {
                if(i==0 || j==0 || i==5-1 || j==5-1)
                {
                    System.out.print("*"); 
                }
                else
                {
                    System.out.print(" "); 
                }
            }
                System.out.println(); 

        }

        for(int i=5;i>=1;i--)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

}