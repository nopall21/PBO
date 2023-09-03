/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author Naufal
 */
public class CheckingAccount extends Account{
    private double fee;
    public CheckingAccount(double bal, int pin, double fee) {
        super(bal, pin);
        this.fee=fee;
    }
    public double getFee(){
        return fee;
    }
}
