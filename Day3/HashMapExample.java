import java.util.HashMap;
class HashMapExample 
{
public static void main(String args[])
{
HashMap<Integer,String> map=new HashMap<Integer,String>();
 
map.put(101,"apple");
map.put(102, "mango");
map.put(103,"grapes");

 System.out.println("HashMap: " + map);
 System.out.println(map.containsKey(101));
 System.out.println(map.containsKey(104));
 
 System.out.println(map.containsValue("apple"));
 System.out.println(map.containsValue("peas"));
 
}
}

