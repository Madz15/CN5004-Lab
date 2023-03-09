
public class Checker1
{
  public static void main(String[] args)
  {
    
		
    // create three customers

    CheckableCustomer customer1 = new CheckableCustomer("A123", "Smith", 100); // valid
    CheckableCustomer customer2 = new CheckableCustomer("1234", "Smith", 100); // invalid
    CheckableCustomer customer3 = new CheckableCustomer("A1234", "Smith", 100); // invalid
    
   

    // send objects to the checkValidity method 
                 
    System.out.println("customer1 is " + checkValidity(customer1));
    System.out.println("customer2 is " + checkValidity(customer2));
    System.out.println("customer3 is " + checkValidity(customer3));
  }

  private static String checkValidity(Checkable objectIn) // receives any Checkable object
  {
    if(objectIn.check())  // call the check method
    {
	return "valid";
    }
    else
    {
       return "invalid";			
    }
  }	
}

