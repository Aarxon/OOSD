package lab3;

public class BankCustomerDriver 
{
    public static void main(String[] args) 
    {
        SavingsAccount Saver1 = new SavingsAccount(1000);
        SavingsAccount Saver2 = new SavingsAccount(2000);
        SavingsAccount Saver3 = new SavingsAccount(3000);

        BankCustomer Aaron = new BankCustomer("Aaron", "Athy");


        Aaron.addAccount(Saver1);


        // Print total balance and account summaries
        System.out.println("Total balance: " + Aaron.balance());
        Aaron.summary();

        Aaron.addAccount(Saver2);

        System.out.println("Total balance: " + Aaron.balance());
        Aaron.summary();

        Aaron.addAccount(Saver3);

        System.out.println("Total balance: " + Aaron.balance());
        Aaron.summary();

        

   
        
    }
}
