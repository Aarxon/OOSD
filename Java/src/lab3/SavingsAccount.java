package lab3;


public class SavingsAccount 
{
    public static double annualInterestRate;
    private double savingsBalance;

    private static int newAccount = 1;
    private int accountNumber;

    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
        this.accountNumber = newAccount;
        newAccount++;
    }

    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }

    public void calculateMonthlyInterest()
    {
       savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public double getBalance()
    {
        return savingsBalance;
    }

    public double getAccountNumber()
    {
        return accountNumber;
    }
    

    



}
