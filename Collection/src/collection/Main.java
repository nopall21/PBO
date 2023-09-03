/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;

import java.util.ArrayList;
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Array Object...");
        Mhs m1 = new Mhs("A11.2022.00111", "Agus", 3.78f);
        Mhs m2 = new Mhs("A11.2022.00111", "Fikri", 3.85f);
        Mhs m3 = new Mhs("A11.2022.00111", "Rafi", 3.18f);
        Mhs m4 = new Mhs("A11.2022.00111", "Mario", 2.81f);
        
        ArrayList<Mhs> listMhs = new ArrayList<Mhs>();
        listMhs.add(m1);
        listMhs.add(m2);
        listMhs.add(m3);
        listMhs.add(m4);
        for(int i=0;i<listMhs.size();i++){       
            listMhs.get(i).printInfo();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        
 
    }
    
}
