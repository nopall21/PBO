/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Naufal
 */
public class Perusahaan {
        String nama;
        Alamat alamat;
        String email;
    
        ArrayList<Karyawan> list = new ArrayList<>();
        
        public Perusahaan(String nama, Alamat alamat, String email){
            this.nama=nama;
            this.alamat=alamat;
            this.email=email;
        }
        String getNama(){
            return nama;
        }
        String getEmail(){
            return email;
        }
        public String getAlamat(){
          return alamat.alamat();  
        }    
}
