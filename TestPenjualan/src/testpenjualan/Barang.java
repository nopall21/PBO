/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpenjualan;

/**
 *
 * @author Naufal
 */
public class Barang {
    String nama;
    String satuan;
    int harga;
    int stok;
    Barang(String nama, String satuan, int harga, int stok){
        this.nama=nama;
        this.satuan=satuan;
        this.harga=harga;
        this.stok=stok;
    }
    String getNama(){
        return nama;
    }
    int getHarga(){
        return harga;
    }
}
