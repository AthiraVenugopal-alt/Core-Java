import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

// Define Student class
class Student 
{
    int rollNo;
    String name;

    Student(int rollNo, String name) //constructor
	{
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() //override
	{
        return rollNo + " " + name;
    }
}
class NameComparator implements Comparator<Student> //custom compartor to sort by name
{
    public int compare(Student s1, Student s2)
	{
        return s1.name.compareTo(s2.name); // alphabetical order
    }
}
public class ComparatorSample 
{
    public static void main(String args[]) 
	{
        ArrayList<Student> list = new ArrayList<>();

        // Add Student objects to the list
        
		list.add(new Student(10, "James"));
        list.add(new Student(11, "Alex"));
        list.add(new Student(12, "Bobby"));

      Collections.sort(list, new NameComparator()); // uses Comparator

        for (Student s : list)
			{
            System.out.println(s);  // Print list
       
     }
}
}

 
 
 