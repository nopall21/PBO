/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author Naufal
 */
public class Alamat {
    String jalan;
    String kelurahan;
    String kecamatan;
    String kota;
    String provinsi;
    public Alamat(String jalan, String kelurahan, String kecamatan, String kota, String provinsi){
        this.jalan=jalan;
        this.kelurahan=kelurahan;
        this.kecamatan=kecamatan;
        this.kota=kota;
        this.provinsi=provinsi;
    }
    public String getAlamat(){
        String textAlamat = jalan +"."+kelurahan+"."+kecamatan+"."+kota+"."+provinsi;
        return textAlamat;
    }
}
