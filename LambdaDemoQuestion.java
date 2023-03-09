public class LambdaDemoQuestion
{
    public static void main(String[] args)
    {
        // create a test customer
       Customer cust = new Customer("A345", "Jones", 200);
         
       // this checks that the ID starts with a character and is of lenght 4
       System.out.println("Customer is " + checkValidity( () -> Character.isLetter(cust.getCustomerId().charAt(0)) 
                                                                    && cust.getCustomerId().length() == 4 )
                         );          
                         
    }
    
    private static String checkValidity(Checkable objectIn)
    {
        if(objectIn.check())
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
}
