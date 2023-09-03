/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Naufal
 */
public class Majalah extends Buku {
  public String namaMajalah;
  public String edisi;

  public Majalah(String idBuku, String penerbit, String namaMajalah, String edisi) {
    super(idBuku, penerbit);
    this.namaMajalah = namaMajalah;
    this.edisi = edisi;
  }

  public String getNamaMajalah() {
    return namaMajalah;
  }

  public String getEdisi() {
    return edisi;
  }
}