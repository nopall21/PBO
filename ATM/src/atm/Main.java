/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.util.Scanner;
/**
 *
 * @author Naufal
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("ATM System...");
        System.out.println("=============");
        Account acc1 = new Account(5000,1234);
        System.out.println(acc1.getBalance());
        acc1.deposit(700);
        System.out.println(acc1.getBalance());
        acc1.withDraw(10000);
        System.out.println(acc1.getBalance());
        // TODO code application logic here
        */
        int pinNum;
        int userOption=0;
        //Account acc1 = new Account(5000,1234);
        CheckingAccount acc1 = new CheckingAccount(5000,1234,2);
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        pinNum = sc.nextInt();
        if (acc1.validatePin(pinNum)){
            //System.out.println("Success...");
            do {
                atm.menu();
                userOption=sc.nextInt();
                switch(userOption){
                    case 1:
                        atm.withDrawMenu();
                        double withDrawAmount = sc.nextDouble();
                        //acc1.withDraw(withDrawAmount);
                        acc1.withDraw(withDrawAmount + acc1.getFee());
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositAmount=sc.nextDouble();
                        acc1.deposit(depositAmount);
                        break;
                    case 3:
                        atm.balanceMenu(acc1.getBalance());
                        break;
                    case 4:
                        acc1.printTransaction();
                        break;
                    case 5:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMassageMenu();
                        break;
                }
            } while(userOption!=5);
        }
    }
    
}
