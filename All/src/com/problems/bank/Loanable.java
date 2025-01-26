package src.com.problems.bank;
interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}
