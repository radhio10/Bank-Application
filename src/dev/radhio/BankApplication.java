package dev.radhio;

import dev.radhio.utilities.CSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azmia Hoque Radhio on 7/17/2020.
 */
public class BankApplication {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        // Read a CSV File then create new Account based on that data
        try {
            String file = "E:\\Java\\Java Projects\\Bank Account Application\\Bank-Application\\CSV File\\NewBankAccounts.csv";
            int i =1;
            List<String[]> accountHolders = CSV.read(file);
            for (String[] newAccount : accountHolders){
                String name,sSN,accountType;
                double initialDeposit;
                name = newAccount[0];
                sSN = newAccount[1];
                accountType = newAccount[2];
                initialDeposit = Double.parseDouble(newAccount[3]);
                if (accountType.equals("Savings")){
                   accounts.add(new Savings(name,sSN,initialDeposit));
                }
                else if (accountType.equals("Checking")){
                    accounts.add(new Checking(name,sSN,initialDeposit));
                }
                else {
                    System.out.println("ACCOUNT TYPE UNDEFINED");
                }
            }
            for (Account account : accounts){
                System.out.println("\nNew Account Number: "+i);
                account.showInfo();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
