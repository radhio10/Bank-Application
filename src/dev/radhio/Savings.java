package dev.radhio;
/**
 * Created by Azmia Hoque Radhio on 7/17/2020.
 */
public class Savings extends Account {
    // List Properties Special to a Savings Account
    private int safetyDepositBoxID, safetyDepositBoxKey;

    // Constructor to Initialize Savings Account Properties
    public Savings(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() -.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods special to the Savings account
    protected void showInfo() {
        System.out.println("Account Type: Savings Account");
        super.showInfo();
        System.out.println("Safety DipositeBox ID:" + safetyDepositBoxID +
                "\nSafety DepositeBox Key:" + safetyDepositBoxKey);
    }
}
