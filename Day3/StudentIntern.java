import java.util.Objects;
class StudentIntern 
{
    int rollno;
    String name;  

    
    public StudentIntern (int rollno, String name) 
	{
        this.rollno = rollno;
        this.name = name;
    }
	public int hashCode()
	{
		return Objects.hash(rollno, name);
	}
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

       StudentIntern s = (StudentIntern) obj;
        return rollno == s.rollno && name.equals(s.name);
	}

    public static void main(String[] args) 
	{
        StudentIntern  s1 = new StudentIntern (2, "Athira");
		StudentIntern  s2 = new StudentIntern (2, "Athira");
        System.out.println("Roll No: " + s1.rollno);
        System.out.println("Name: " + s1.name);
		 System.out.println("HashCode: " + s1.hashCode());
		 System.out.println(s1.equals(s2));
    }
}
