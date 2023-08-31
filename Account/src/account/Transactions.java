/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package account;

/**
 *
 * @author Naufal
 */
public interface Transactions {
    boolean withDraw(double creditAmt);
    boolean deposit(double debittAmt);
    double getBalance();
}
