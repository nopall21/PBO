/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Naufal
 */
public abstract class Account implements Transactions {
    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextAccountNumber = 1001;
    public Account(double bal, int pin){
        this.balance = bal;
        this.pin = pin;
        accountNumber = getNextAccountNumber();
    }
    public boolean validatePin(int p){
        if (this.pin==p){
            return true;
        }
        System.out.println("Invalid Pin");
        return false;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public static int getNextAccountNumber(){
        int accNo = nextAccountNumber;
        nextAccountNumber++;
        return accNo;
    }
    
    @Override
    public boolean withDraw(double debitAmt){
        if(debitAmt>balance){
            System.out.println("Insufficient fund.");
            return false;
        }
        balance -= debitAmt;
        Transactions.recordTransaction(debitAmt,"Debit");
        System.out.println("Please take your card and your money.");
        return true;
    }
    
    @Override
    public boolean deposit(double creditAmt){
        balance += creditAmt;
        Transactions.recordTransaction(creditAmt,"Credit");
        System.out.println("Deposite Successfull");
        return true;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    public boolean printTransaction(){
        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader("transaction.txt"))) {
            String currLine;
            while ((currLine = reader.readLine())!=null){
                content.append(currLine).append("\n");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(content);
        return true;
    }
}
