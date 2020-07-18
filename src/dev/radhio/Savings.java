package dev.radhio;

public class Savings extends Account {
    // List Properties Special to a Savings Account
    private int safetyDipositeBoxID, safetyDepositeBoxKey;

    // Constructor to Initialize Savings Account Properties
    public Savings(String name, String sSN, double initialDiposite) {
        super(name, sSN, initialDiposite);
        accountNumber = "1" + accountNumber;
        setSafetyDipositeBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() -.25;
    }

    private void setSafetyDipositeBox() {
        safetyDipositeBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods special to the Savings account
    protected void showInfo() {
        System.out.println("Account Type: Savings Account");
        super.showInfo();
        System.out.println("Safety DipositeBox ID:" + safetyDipositeBoxID +
                "\nSafety DepositeBox Key:" + safetyDepositeBoxKey);
    }
}
