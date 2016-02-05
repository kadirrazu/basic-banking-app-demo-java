
package bankingapp;

/**
* Parent Class for Current and Savings Account
**/

public class Account {
    
    private String customerName;
    private int accountNumber;
    private String accountType;
    private double accountBalance;
    
    public Account(String name, int number, String type, double balance)
    {
        customerName = name;
        accountNumber = number;
        accountType = type;
        accountBalance = balance;
    }
    
    public void setCustomerName( String name )
    {
       customerName = name; 
    } //end of setCustomerName
    
    public String getCustomerName()
    {
        return customerName;
    } //end of getCustomerName
    
    public void setAccountNumber(int number)
    {
        accountNumber = number;
    } //end of setAccountNumber
    
    public int getAccountNumber()
    {
        return accountNumber;
    } //end of getAccountNumber
    
    public void setAccountType( String type )
    {
       accountType = type; 
    } //end of setAccountType
    
    public String getAccountType()
    {
        return accountType;
    } //end of getAccountType
    
    public void setAccountBalance( double balance )
    {
        accountBalance = balance;
    }  //end of setAccountBalance
    
    public double getAccountBalance()
    {
        return accountBalance;
    }  //end of getAccountBalance
    
    public void showAccountDetails()
    {
        System.out.printf("Account Title: %s\n", customerName);
        System.out.printf("Account Number: %d\n", accountNumber);
        System.out.printf("Account Type: %s\n", accountType);
        System.out.printf("Balance: %.2f\n", accountBalance);
    }
    
}
