/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Naufal
 */
public class Buku {
    
  public String idBuku;
  public String penerbit;
  public boolean statusPinjam;

  public Buku(String idBuku, String penerbit) {
    this.idBuku = idBuku;
    this.penerbit = penerbit;
    this.statusPinjam = false;
  }

  public String getIdBuku() {
    return idBuku;
  }

  public String getPenerbit() {
    return penerbit;
  }

  public boolean getStatusPinjam() {
    return statusPinjam;
  }

  public void setStatusPinjam(boolean status) {
    this.statusPinjam = status;
  }
}
