
public class InheritanceExample {

    public static void main(String[] args) {

        // Calc c1 = new Calc();
        // int r1 = c1.add(7,8);
        // int r2 = c1.sub(9, 6);

        AdvancedCalc c1 = new AdvancedCalc();

        int r1 = c1.add(1, 2);
        int r2 = c1.sub(5, 2);
        int r3 = c1.multi(7, 8);
        int r4 = c1.division(9, 6);
        

        System.out.println(r1 + " , " + r2 + ", " + r3 + " ," + r4);

    }

}
