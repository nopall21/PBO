/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author Naufal
 */
public class ATM {
    public ATM(){
        System.out.println("Enter your PIN :");
    }
    public void menu(){
        System.out.println("n1. WithDraw");
        System.out.println("n2. Deposit");
        System.out.println("n3. Balance Inquiry");
        System.out.println("n4. Print Transaction");
        System.out.println("n5. Exit");
    }
    public void withDrawMenu(){
        System.out.println("Enter a Mount to Withdraw");
    }
    public void depositMenu(){
        System.out.println("Enter a Mount to Deposit");
    }
    public void balanceMenu(double balance){
        System.out.printf("The Balance is %.2f",balance);
    }
    public void invalidMassageMenu(){
        System.out.println("Invalid option, try again.");
    }
    public void exitMenu(){
        System.out.println("Thanks for banking with us.");
    }
}
