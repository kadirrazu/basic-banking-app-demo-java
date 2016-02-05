/*
 * Sample Java App - Banking Assignment Solution
 * Programmed by: Md. Abdul Kadir Razu
 */
 
package bankingapp;

/**
 *
 * @author razu
 */
public class BankingApp {

    public static void main(String[] args) {
        
        //Current Account Object
        CurrentAccount current = new CurrentAccount("Md. Hasan Masud", 10124005, 2000);
        
        current.showAccountDetails();
        
        current.depAmount();
        
        current.withdraw();
        
        current.computeInterest();
        
        current.showBalance();
        
        //Savings Account Object
        SavingsAccount savings = new SavingsAccount("Md. Rabiul Alam", 10254555, 5000);
        
        savings.showAccountDetails();
        
        savings.depAmount();
        
        savings.withdraw();
        
        savings.computeInterest();
        
        savings.showBalance();
        
    }
    
}
