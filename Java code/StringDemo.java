class StringDemo{
    public static void main(String args[])
    {
         String name ="pranathi";
        //  String name = new String("pranathi"); 
        name = name + " boddu";
        name.concat("world"); // doesnt not concat 

         System.out.println(name);
         System.out.println("hello " + name);

         System.out.println(name.concat(" hi"));

         StringBuffer sb = new StringBuffer("pranathi");
         System.out.println(sb.capacity()); // 16 +8
         sb.append(" boddu");
        //  sb.deleteCharAt(2);
         sb.insert(8, " Java ");
         System.out.println(sb);




    }
}