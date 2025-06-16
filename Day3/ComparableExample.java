import java.util.*;

class Student implements Comparable<Student>
 {
    int rollNo;
    String name;

    Student(int rollNo, String name)
	{
        this.rollNo = rollNo;
        this.name = name;
    }

    
    public int compareTo(Student s) // Natural ordering: sort by rollNo
	{
        return this.rollNo - s.rollNo; // ascending order
    }

    public String toString() 
	{
        return rollNo + " " + name;
    }
}

public class ComparableExample 
{
    public static void main(String[] args) 
	{
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(102, "Alice"));
        list.add(new Student(101, "Bob"));
        list.add(new Student(103, "Charlie"));

        Collections.sort(list); // uses compareTo()

        for (Student s : list) 
		{
            System.out.println(s);
        }
    }
}