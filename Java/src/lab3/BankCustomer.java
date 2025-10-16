package lab3;

public class BankCustomer 
{
    private String name;
    private String address;

    private SavingsAccount[] accounts = new SavingsAccount[3]; 
    private int numAccounts = 0; 

    public BankCustomer(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }

    public void addAccount(SavingsAccount account) 
    {
        if (numAccounts < 3) 
        {
            accounts[numAccounts] = account;
            numAccounts++;
        } else 
        {
            System.out.println("You can't exceed three savings accounts!");
        }
    }

    public double balance() 
    {
        double total = 0;
        for (int i = 0; i < numAccounts; i++) 
        {
            total += accounts[i].getBalance();
        }
        return total;
    }

    public void summary() 
    {
        for (int i = 0; i < numAccounts; i++) 
        {
            System.out.println("Account " + accounts[i].getAccountNumber() + ": " + accounts[i].getBalance());
        }
    }
}