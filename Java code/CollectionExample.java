import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable<Student>{

    int age;
    String name;
    public Student(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }
    public String toString() 
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    //used for Comparable
    public int compareTo(Student that) {

        if(this.age > that.age)
        return 1;
        else
        return -1;
    }    
 
}

public class CollectionExample {
    public static void main(String[] args) {

        //list contains duplicate values and hava a proper order
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(76);
        nums.add(76);
        nums.add(95);
        nums.add(31);
        nums.add(23);

        // nums.get(4);

        // System.out.println(nums);

        for (int n : nums) {
            System.out.println(n);
        }

        //sorting
        Collections.sort(nums);
        System.out.println("Sorted order :" +nums);

        //sorting based on last digit
        Comparator<Integer> comp = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j% 10)
                    return 1;
                else
                    return -1; 

            }

        };

        Collections.sort(nums,comp);
        System.out.println("Sorted order based on last digit :" +nums);

        //Student List 
        
        List<Student> student = new ArrayList<>();

        student.add(new Student(21, "prans"));
        student.add(new Student(25, "kristi"));
        student.add(new Student(19, "rashmi"));
        student.add(new Student(30, "roni"));


        //sorting based on age
        // Comparator<Student> comp1 = new Comparator<Student>() 
        // {
        //     public int compare(Student i, Student j)
        //     {
        //         if(i.age > j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        
        //Using lambda expressions
        Comparator<Student> comp1 = (i, j) -> i.age > j.age ?1:-1 ;

        Comparator<Student> comp2 = (i, j) -> i.name.compareTo(j.name);

        Collections.sort(student,comp2);
        //Collections.sort(student);

        for(Student s: student)
        {
            System.out.println(s);
        }




        //set has unique values(does not contain duplicate values) and does not follow any order
        Set<Integer> nums1 = new HashSet<Integer>();

        nums1.add(4);
        nums1.add(39);
        nums1.add(24);
        nums1.add(4);

        System.out.println("Hash Set Set Values:");
        for (int n : nums1) {
            System.out.println(n);
        }
        
        //if you want set to be sorted set we need to use TreeSet
        Set<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(4);
        nums2.add(39);
        nums2.add(24);
        nums2.add(4);

        System.out.println("Tree Set Values: sorted order");

        Iterator<Integer> values = nums2.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
        
        // for (int n : nums2) {
        //     System.out.println(n);
        // }

        
    //Maps - collection of key value pair- related to Collecion API
    //Map - interface 

    Map<String, Integer> students = new HashMap<>();
    
    students.put("pranathi", 7);
    students.put("krishna", 9);
    students.put("prans", 1);
    students.put("kristi", 8);
    students.put("krishna", 10);

    System.out.println("Map Values");
    System.out.println(students.keySet());

    for(String key : students.keySet())
    {
        System.out.println(key + " : " + students.get(key));
    }
    


    // System.out.println(students);



    }


}
