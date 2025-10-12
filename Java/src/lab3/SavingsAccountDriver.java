package lab3;
class SavingsAccountDriver 
{
    public static void main(String[] args) 
    {
        SavingsAccount Saver1 = new SavingsAccount(2000);
        SavingsAccount Saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);

        Saver1.calculateMonthlyInterest();
        Saver2.calculateMonthlyInterest();


        System.out.println("The Monthly Interest rate for month 1 account number  " + Saver1.getAccountNumber() + " is " + Saver1.getBalance());
        System.out.println("The Monthly Interest rate for month 1 for account number  " + Saver2.getAccountNumber() + " is " + Saver2.getBalance());


        System.out.println(" ");

        SavingsAccount.modifyInterestRate(0.05);

        Saver1.calculateMonthlyInterest();
        Saver2.calculateMonthlyInterest();

        System.out.println("The Monthly Interest rate for month 2 account number  " + Saver1.getAccountNumber() + " is " + Saver1.getBalance());
        System.out.println("The Monthly Interest rate for month 2 for account number  " + Saver2.getAccountNumber() + " is " + Saver2.getBalance());

    }

}
