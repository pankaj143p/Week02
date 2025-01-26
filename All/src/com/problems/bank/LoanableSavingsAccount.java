package src.com.problems.bank;
class LoanableSavingsAccount extends SavingsAccount implements Loanable {
    private static final double MIN_BALANCE_FOR_LOAN = 5000.00;

    public LoanableSavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for: " + amount);
        } else {
            System.out.println("Loan application rejected. Minimum balance requirement not met.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= MIN_BALANCE_FOR_LOAN;
    }
}