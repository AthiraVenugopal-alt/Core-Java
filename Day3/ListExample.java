import java.util.ArrayList;
//import java.util.LinkedList;
class ListExample
{
public static void main (String args[])
{
ArrayList<String> a1 =new ArrayList<String>();
//LinkedList<String> a1 = new LinkedList<String>();
a1.add("apple");
a1.add("mango");
a1.add("apple");
//a1.remove(2);
System.out.println("Listnames:" +a1);

ArrayList<String> a2 = new ArrayList<String>();
a2.add("tomato");
a2.add("onion");
a2.add("peas");
System.out.println("Listnames:"  +a2);

a2.addAll(a1);                     // a1 added to a2
System.out.println(a1);

System.out.println(a1.contains("peas"));
System.out.println(a1.contains("apple"));
System.out.println(a2.contains("berry"));

System.out.println(a1.isEmpty());
System.out.println(a1.get(1));
System.out.println(a2.get(2));


}
}

