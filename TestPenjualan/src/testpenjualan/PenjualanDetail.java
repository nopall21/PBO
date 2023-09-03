/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpenjualan;

/**
 *
 * @author Naufal
 */
public class PenjualanDetail {
    Barang brg;
    int jml;
    PenjualanDetail(Barang brg, int jml){
        this.brg=brg;
        this.jml=jml;
    }
    int getSubTotal(){
        return brg.harga*jml;
    }
    String getNamaBrg(){
        return brg.getNama();
    }
    int getHarga(){
        return brg.getHarga();
    }
}
