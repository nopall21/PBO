/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Naufal
 */
public class Account {
    
public class Account implements Transactions{
    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextAccountNumber = 1001;
    public Account(double bal,  int pin)
    {
        this.balance=bal;
        this.pin=pin;
        accountNumber = getNextAccountNumber();
    }
    public boolean validatePin(int p){
        if(this.pin==p){
            return true;
        }
        System.out.println("Invalid PIN");
        return false;
    }
    public int getAccountNumber(){return accountNumber;}
    public static int getNextAccountNumber(){
        int accNo=nextAccountNumber;
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
        System.out.println("Please take your card and your money!");
        return true;
    }
    @Override
    public boolean deposit(double creditAmt){
        balance += creditAmt;
        System.out.println("Deposite Successfull!");
        return true;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
/**
 *
 * @author Naufal
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

