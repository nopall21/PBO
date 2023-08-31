/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("ATM System...");
        System.out.println("=============");
        Account acc1 = new Account(5000,1234);
        System.out.println(acc1.getBalance());
        acc1.deposit(700);
        System.out.println(acc1.getBalance());
        acc1.withDraw(10000);
        System.out.println(acc1.getBalance());
    }
}