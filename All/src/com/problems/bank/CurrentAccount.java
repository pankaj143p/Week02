package src.com.problems.bank;



class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.00;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

    public double getOverdraftLimit() {
        return OVERDRAFT_LIMIT;
    }
}