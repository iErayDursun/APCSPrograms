//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts, numDeposits, numWithdrawals; 
    private static double amtDeposits, amtWithdrawals;

    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = (int) (Math.random() * Integer.MAX_VALUE);
        //added
        numAccounts++;
    }

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        //added
        numAccounts++;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
            
        numWithdrawals++;
        amtWithdrawals+=amount;
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
        
        numDeposits++;
        amtDeposits+=amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return("Name: "+name+"\nAcct #: "+acctNum+"\nBalance: "+balance);
    }

    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee()
    {
        balance-=10;
        return balance;
    }
    //----------------------------------------------
    // Changes the name on the account 
    //----------------------------------------------
    public void changeName(String newName)
    {
        name=newName;
    }

    //gets the number of accounts
    public static int getNumAccounts() {
        return numAccounts;
    }

    //closes account
    public void close() {
        name="CLOSED";
        balance=0;
        numAccounts--;
    }

    //consolidates accounts
    public static Account consolidate(Account acct1, Account acct2){
        if (acct1.name.equals(acct2.name) && acct1.acctNum != acct2.acctNum) {
            Account acctx = new Account(acct1.balance + acct2.balance, acct1.name);
            acct1.close();
            acct2.close();
            return acctx;
        }
        else {
            System.out.println("Accounts failed to consolidate.");
            return null;
        }
    }
    
    public static int getNumDeposits (){
        return numDeposits;
    }
    
    public static double getAmtWithdrawals(){
        return amtWithdrawals;
    }
    
    public static double getAmtDeposits(){
        return amtDeposits;
    }
    
    public static int getNumWithdrawals(){
        return numWithdrawals;
    }
    
    public long getAcctNumber(){
        return acctNum;
    }
    
    public static void resetDay(){
        numDeposits=0;
        amtWithdrawals=0;
        amtDeposits=0;
        numWithdrawals=0;
    }
    
    public void transfer(Account acct, double amount){
        this.withdraw(amount);
        acct.deposit(amount);
    }
    
    public static void transfer(Account acct1, Account acct2, double amount){
        acct1.withdraw(amount);
        acct2.deposit(amount);
    }

}