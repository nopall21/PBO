/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author Naufal
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan = 0;
    String id, nama, judul, pengarang, penerbit, namaMajalah, edisi;

    // Membuat objek Anggota
    System.out.print("Masukkan ID Anggota: ");
    id = input.nextLine();
    System.out.print("Masukkan Nama Anggota: ");
    nama = input.nextLine();
    Anggota anggota = new Anggota(id, nama);

    while (pilihan != 5) {
      System.out.println("\nMenu:");
      System.out.println("1. Tambah Buku Diktat");
      System.out.println("2. Tambah Majalah");
      System.out.println("3. Tampilkan Buku Dipinjam");
      System.out.println("4. Pinjam Buku");
      System.out.println("5. Keluar");
      System.out.print("Pilihan: ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan ID Buku Diktat: ");
          id = input.next();
          input.nextLine(); // membersihkan newline
          System.out.print("Masukkan Penerbit Buku Diktat: ");
          penerbit = input.nextLine();
          System.out.print("Masukkan Judul Buku Diktat: ");
          judul = input.nextLine();
          System.out.print("Masukkan Pengarang Buku Diktat: ");
          pengarang = input.nextLine();
          BukuDiktat bukuDiktat = new BukuDiktat(id, penerbit, judul, pengarang);
          anggota.addBuku(bukuDiktat);
          break;
        case 2:
          System.out.print("Masukkan ID Majalah: ");
          id = input.next();
          input.nextLine(); // membersihkan newline
          System.out.print("Masukkan Penerbit Majalah: ");
          penerbit = input.nextLine();
          System.out.print("Masukkan Nama Majalah: ");
          namaMajalah = input.nextLine();
          System.out.print("Masukkan Edisi Majalah: ");
          edisi = input.nextLine();
          Majalah majalah = new Majalah(id, penerbit, namaMajalah, edisi);
          anggota.addBuku(majalah);
          break;
        case 3:
          anggota.displayBukuDipinjam();
          break;
        case 4:
          System.out.print("Masukkan ID Buku yang ingin dipinjam: ");
          id = input.next();
          for (Buku b : anggota.listBuku) {
            if (b.getIdBuku().equals(id)) {
              if (b.getStatusPinjam()) {
                System.out.println("Buku sedang dipinjam oleh anggota lain");
              } else {
                b.setStatusPinjam(true);
                System.out.println("Buku berhasil dipinjam");
              }
              break;
            }
          }
          break;
        case 5:
          break;
        default:
          System.out.println("Pilihan tidak tersedia");
          break;
      }
    }
  }
}
