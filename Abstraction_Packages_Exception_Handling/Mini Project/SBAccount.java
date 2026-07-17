public class SBAccount extends Account {

    private String accountType;

    public SBAccount(double amount, String accountType) {
        super(amount);
        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() {

        if(accountType.equalsIgnoreCase("NRI"))
            interestRate = 6;
        else
            interestRate = 4;

        return amount * interestRate / 100;
    }
}