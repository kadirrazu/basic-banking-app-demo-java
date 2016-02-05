
package bankingapp;

import java.util.Scanner;


public class CurrentAccount extends Account{
    
    Scanner input = new Scanner( System.in );
    
    public CurrentAccount(String name, int number, double balance)
    {
        super(name, number, "Current Account", balance);
    } //constructor ends
    
    public void depAmount()
    {
        
        System.out.print("Please enter the amount to deposit (double): ");
        
        double depAmt = input.nextDouble();
        
        double newAmount = super.getAccountBalance() + depAmt;
        
        super.setAccountBalance( newAmount );
        
        System.out.printf("Amount %.2f was deposited successfully.\n", depAmt);
        
    } //end of depAmount method
    
    public void showBalance()
    {
        double currentBalance = super.getAccountBalance();
        
        System.out.printf( "Account Balance is: %.2f\n",  currentBalance);  
        
    } //end of showBalance method
    
    public void computeInterest()
    {
        System.out.println("Sorry, Current Account is not eligible for interest!");
        
    } //end of computeInterest method
    
    public void withdraw()
    {
        System.out.print("How much amount you want to draw (double)?: ");
        
        double drawAmt = input.nextDouble();
        
        if( drawAmt < 0 ){
            System.out.println("Invalid amount!"); 
            return;
        }
        
        if( drawAmt > super.getAccountBalance() ){
            System.out.println("Amount exceeds the account balance!"); 
            return;
        }
        
        if( (drawAmt + 500) > super.getAccountBalance() )
        {
           System.out.println("You did a panelty! Should maintain at least 500.00 BDT."); 
           System.out.println("Withdrwal Cancelled!"); 
        }
        else
        {       
            double balance = super.getAccountBalance() - drawAmt;

            System.out.printf("You have drawn: %.2f\n", drawAmt);

            super.setAccountBalance(balance);

            System.out.printf( "Updated Balance is: %.2f\n", super.getAccountBalance() );
        }
    } //end of withdraw method
    
}
