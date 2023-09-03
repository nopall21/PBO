/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package atm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Naufal
 */
public interface Transactions {
    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy:MM:dd - HH:mm:ss");
    String dtf = ldt.format(df);
    boolean withDraw(double creditAmt);
    boolean deposit(double debitAmt);
    double getBalance();
    static boolean recordTransaction (double transactionAmt, String transactionType) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.txt", true))){
            writer.write((transactionType == "Credit") ? "\n\tAmount credited: $" + 
                    transactionAmt + "\tDate:" + dtf : "\n\tAmount debited: $" + transactionAmt + "\tDate" + dtf);
        } catch (IOException e) {
            System.out.println("error occured writing to file");
            e.printStackTrace();
        }
        return true;
    }
}
