package collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal
 */
public class Mhs {
    String nim;
    String nama;
    Float ipk;
    
    public Mhs(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public float getIpk() {
        return ipk;
    }
    
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

}
