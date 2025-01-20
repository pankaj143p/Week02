public class BankAccount {
    // Static variable
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0; 
    private final long accountNumber;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; 
        totalAccounts++;
    }
    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details (checking instanceof)
    public void displayAccountDetails(Object account) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    
    // Static method to get the bank name
    public static String getBankName() {
        return bankName;
    }

    // Getter for accountNumber (final variable, can't modify the value)
    public long getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount account1 = new BankAccount("Nikhil", 1893723973);
        BankAccount account2 = new BankAccount("sumit", 678908098);
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        account1.displayAccountDetails(account1);
        account2.displayAccountDetails(account2);
    }
}
