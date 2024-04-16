
@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void show(int i);
}

// class B implements A
// {

// public void show()
// {
// System.out.println("In Show");
// }

// }

@FunctionalInterface
interface C{
    int add(int i, int j);
}

@FunctionalInterface
interface D{
    String appendString(String str);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();

        // lambda expressions

        A obj1 = () -> System.out.println("In Show");
        // {
        // System.out.println("In Show");
        // };

        obj1.show();

        // B obj2 = (int i) -> System.out.println("In Show B : " +i);
        B obj2 = i -> System.out.println("In Show B : " +i);

        obj2.show(5);


        C obj3 = new C() {
            public int add(int i, int j)
            {
                return i+j;
            }
        };

        int r1 = obj3.add(8, 9);
        System.out.println(r1);


        // using lambda expressions

        //C obj4 = (int i, int j) ->  return i+j;
        C obj4 = (i,  j) -> i+j;
        int r2 = obj4.add(10, 20);
        System.out.println(r2);

        D obj5 = (str) -> str.concat(" boddu");
        String r5 = obj5.appendString("pranathi");
        System.out.println("Legth of string : " +r5);


    }
}
