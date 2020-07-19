package dev.radhio.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Azmia Hoque Radhio on 7/19/2020.
 */
public class CSV {
    // This function will read data from CSV file and return as a List
    public static List<String[]> read(String file) throws FileNotFoundException {
        List<String[]> data = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            String account;
            while ((account = br.readLine()) !=null){
                String[] accountRecords = account.split(",");
                data.add(accountRecords);
            }
        } catch (IOException e) {
            System.out.printf("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }
}
