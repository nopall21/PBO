/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author Naufal
 */
public class Karyawan {
    String NIK, nama;
    Alamat alamat;

public Karyawan(String NIK, String nama){
    this.NIK=NIK;
    this.nama=nama;
}

public void setAlamat(Alamat alamat){
    this.alamat=alamat;
}

public String getNIK(){
    return NIK;
}

public String getNama(){
    return nama;
}

public String getAlamat(){
    return alamat.alamat();
}

}