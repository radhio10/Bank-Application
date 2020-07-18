package dev.radhio;

public abstract class Account implements IBaseRate {
    // List Common Properties for Saving and Checking Accounts
    private String name, sSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 1000;

    // Constructor to Set Base Properties and initialize tha Account
    public Account(String name, String sSN, double initialDiposite) {
        this.name = name;
        this.sSN = sSN;
        balance = initialDiposite;
        //Set Account Number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        index++;
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compoundInterest(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest:"+accruedInterest);
    }

    // List Common Methods
    public void deposite(double amount) {
        balance = balance + amount;
        System.out.println("Deposting:"+amount);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing:"+amount);
    }

    public void transfer(String toWhom,double amount) {
        balance = balance - amount;
        System.out.println("Transfering:"+amount+" To "+toWhom);
    }

    public void printNewBalance() {
        System.out.println("New Balance:"+balance);
    }

    protected void showInfo() {
        System.out.println("Name:" + name + "\nsSN:" + sSN + "\nBalance:" + balance);
        System.out.println("Account Number:" + accountNumber + "\nInterest Rate:" + rate);
    }
}
