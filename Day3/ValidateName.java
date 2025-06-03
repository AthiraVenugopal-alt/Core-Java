
class NameException extends Exception
 {
    public NameException(String message)
	{
        super(message);
    }
}

public class ValidateName
{

   
    static void validateName(String name) throws NameException
	{
        if (name.length() <=4)
		{
            throw new NameException("Name not allowed");
        }
		else
		{
		System.out.println("allowed");
		
    }
	}

    
    public static void main(String[] args) 
	{
       
        try 
		{
            validateName("Ajay"); 

                    } 
		catch (NameException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

