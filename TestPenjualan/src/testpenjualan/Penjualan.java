/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpenjualan;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.text.DecimalFormat;
/**
 *
 * @author Naufal
 */
public class Penjualan {
    LocalDate tgl;
    Pelanggan plg;
    List<PenjualanDetail> listPD = new ArrayList<PenjualanDetail>();
    Penjualan(LocalDate tgl, Pelanggan plg){
        this.tgl=tgl;
        this.plg=plg;
    }
    void add(PenjualanDetail pd){
        listPD.add(pd);
    }
    int getTotal(){
        int total=0;
        for (int i=0;i<listPD.size();i++){
            total+= listPD.get(i).getSubTotal();
        }
        return total;
    }
    void printInfo(){
        System.out.println("Penjualan ");
        System.out.println("tgl: "+tgl);
        System.out.println("pelanggan: "+plg.getNama());
        System.out.println("-----------------------");
        for (int i=0;i<listPD.size();i++){
            System.out.print(listPD.get(i).getNamaBrg()+"\t"+listPD.get(i).jml+"\t"+
                    listPD.get(i).getHarga()+"\t"+listPD.get(i).getSubTotal()+"\n");
        }
        System.out.println("-----------------------");
        DecimalFormat ft = new DecimalFormat("####");
        ft = new DecimalFormat("###,###.##");
        System.out.printf("Total:"+ft.format(getTotal()));
    }
}
