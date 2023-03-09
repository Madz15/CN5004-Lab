public class CheckableCustomer extends Customer implements Checkable
{
    public CheckableCustomer(String idIn, String nameIn, double limitIn)
    {
        super(idIn, nameIn, limitIn);
    }
    
    @Override
    public boolean check()
    {
        return Character.isLetter(getCustomerId().charAt(0)) && getCustomerId().length() == 4;
    }
}
