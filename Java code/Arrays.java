class Arrays {
    public static void main(String args[]) {
        int num[] = { 6, 5, 7 };
        int temp = 0;
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i -1; j++) {
                if (num[j] > num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Sorted order" +num[i]);
        }

        /*
         * for(int i=0;i<3;i++)
         * {
         * System.out.println(num[i]);
         * }
         * 
         * int nums[] = new int[4];
         * //initials all values of nums will be 0
         * 
         * //multiple arrays / multi dimensional arrays
         * 
         * int multi[][] = new int[3][4];
         * //one big array has 3 inetrnal arrays and each array has 4 elements in it
         * for(int i =0;i<3;i++)
         * {
         * for(int j =0;j<4;j++)
         * {
         * multi[i][j] = (int) (Math.random() * 10);
         * }
         * }
         * 
         * for(int i =0;i<3;i++)
         * {
         * for(int j =0;j<4;j++)
         * {
         * System.out.print(multi[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * //enhanced for loop
         * 
         * for(int n[] : multi)
         * {
         * for(int m:n)
         * {
         * System.out.print(m + " ");
         * }
         * System.out.println();
         * }
         * 
         * //jagged array
         * 
         * int jagged[][] = new int[3][];
         * 
         * jagged[0] = new int[3];
         * jagged[1] = new int[4];
         * jagged[2] = new int[2];
         * 
         * for(int i=0; i<jagged.length;i++)
         * {
         * for(int j=0;j<jagged[i].length;j++)
         * {
         * jagged[i][j] = (int) (Math.random() * 10);
         * }
         * }
         * 
         * for(int n[] : jagged)
         * {
         * for(int m : n)
         * {
         * System.out.print(m + " ");
         * }
         * System.out.println();
         * 
         * }
         * 
         * int num1[] = new int[6];
         * // for(int i=0;i<7;i++) // arrayindexout of bound exception (run time error)
         * for(int i=0;i<num1.length;i++)
         * {
         * System.out.println(num1[i]);
         * 
         * }
         * //for each loop
         * int num2[] = new int[6];
         * num2[0] = 1;
         * num2[1] = 2;
         * num2[2] = 3;
         * num2[3] = 4;
         * num2[4] = 5;
         * num2[5] = 6;
         * 
         * for(int n : num2)
         * {
         * System.out.println(n);
         * }
         * 
         * //Student Array
         * 
         * Student s1 = new Student();
         * s1.rollno = 1;
         * s1.name="prans";
         * s1.marks = 97;
         * 
         * Student s2 = new Student();
         * s2.rollno = 1;
         * s2.name="pranathi";
         * s2.marks = 90;
         * 
         * Student students[] = new Student[2]; //array
         * students[0] =s1;
         * students[1] = s2;
         * 
         * // for(int i=0;i< students.length ; i++)
         * // {
         * // System.out.println(students[i].name + " : " + students[i].marks);
         * // }
         * 
         * //enhanced for loop or for each loop
         * 
         * for(Student s : students)
         * {
         * System.out.println(s.name + " : " + s.marks);
         * }
         */
    }
}

class Student {
    int rollno;
    String name;
    int marks;

}