
package src.com.problems.bank;
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(101, "Kartik", 10000.00);
        BankAccount currentAccount = new CurrentAccount(102, "Bahadur", 3000.00);
        Loanable loanableAccount = new LoanableSavingsAccount(103, "Me", 6000.00);
        System.out.println("Initial Balance of Savings Account: " + savingsAccount.getBalance());
        System.out.println("Initial Balance of Current Account: " + currentAccount.getBalance());
        savingsAccount.deposit(2000);
        currentAccount.withdraw(500);
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());
        if (loanableAccount instanceof Loanable) {
            LoanableSavingsAccount loanAccount = (LoanableSavingsAccount) loanableAccount;
            loanAccount.applyForLoan(10000.00);
        }
        System.out.println("Final Balance of Savings Account: " + savingsAccount.getBalance());
        System.out.println("Final Balance of Current Account: " + currentAccount.getBalance());
    }
}
