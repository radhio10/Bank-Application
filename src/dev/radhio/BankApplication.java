package dev.radhio;

public class BankApplication {
    public static void main(String[] args) {
        Checking checking = new Checking("Radhio","135795123",1000.00);
        Savings savings = new Savings("Hoque","32197531",2000.00);
        checking.showInfo();
        System.out.println("*************");
        savings.showInfo();
        savings.compoundInterest();
        savings.printNewBalance();
        // Read a CSV File then create new Account based on that data
    }
}
