package dev.radhio;
/**
 * Created by Azmia Hoque Radhio on 7/17/2020.
 */
public class Checking extends Account {
    // List Properties Special to a Checking Account
    private int debitCardNumber,debitCardPIN;

    // Constructor to Initialize Checking Account Properties
    public Checking(String name,String sSN, double initialDiposit){
        super(name,sSN,initialDiposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() *.15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPIN = (int) (Math.random()*Math.pow(10,4));
    }

    // List any methods special to the Checking account
    protected void showInfo(){
        System.out.println("Account Type: Checking Account");
        super.showInfo();
        System.out.println("Debit Card Number:"+ debitCardNumber+
                "\nDebit Card PIN:"+debitCardPIN);

    }
}
