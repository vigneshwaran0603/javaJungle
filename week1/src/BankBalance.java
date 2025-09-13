public class BankBalance
{
    public static void main(String[] args) {
        int bal;
        bal=1500;
        if(bal>0)
        {
            System.out.println("positive balance");
        }
        else if(bal<0)
        {
            System.out.println("overdraft");
        }
        else {
            System.out.println("zero balance");
        }
    }
}