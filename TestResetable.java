
public class TestResetable
{
	public static void main(String[] args)
	{
            // create an Oblong object and BankAccount Object
	    Oblong oblong = new Oblong(10,12);
            BankAccount acc = new BankAccount("12345678", "QC");
            
            // Make a deposit into the BankAccount object
            acc.deposit(2000);

            /* call the resetObject method with a lambda expression that sets
               the length and height of the Oblong to 1 */
            
            resetObject( () -> {
                                    oblong.setLength(1);
                                    oblong.setHeight(1);
                                }
                       );
              
            /* call the resetObject method with a lambda expression that sets
               the balance of the BankAccount object to zero. You can't do this 
               directly because there is no setBalance method - but you can
               withdraw the total amount that is in the account */
            
            resetObject( () -> acc.withdraw(acc.getBalance()));
            
           
            
            /* display the length and height of the oblong (which should now
               be 1) and the balance of the bank account (which should now be 
               zero) */
            
            System.out.println("Oblong length: " + oblong.getLength());
            System.out.println("Oblong height: " + oblong.getHeight());
            System.out.println("Bank balance: " + acc.getBalance());
     // write a resetObject method as follows: 
        }
        
      static void resetObject(Resetable objectIn)	
      {
		objectIn.reset();
      }
}
