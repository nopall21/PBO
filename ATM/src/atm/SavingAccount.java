/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author Naufal
 */
public class SavingAccount extends Account {
    private float interestRate;
    public SavingAccount(double bal, int pin, float rate) {
        super(bal, pin);
        this.interestRate=rate;
    }
    public double calculateInterest(){
        double interest = this.getBalance() * this.interestRate;
        return interest;
    }    
}
