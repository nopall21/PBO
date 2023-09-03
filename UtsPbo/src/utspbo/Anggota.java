package utspbo;

import java.util.ArrayList;

public class Anggota {

    String idAnggota, nama;
    
    ArrayList<Buku> listBuku = new ArrayList<>();

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }
 
    public void addBuku(Buku buku) {
        if(buku.statusPinjam == 'y'){
            System.out.println("buku gagal dipinjam..");
        }
        else {
            listBuku.add(buku);
            buku.statusPinjam = 'y';
            System.out.println("buku berhasil dipinjam..");
        }
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }
    
    public void displayBukuDipinjam() {
        System.out.println("Daftar Buku yg dipinjam: " + nama);
        System.out.println("---------------------------------------------");
        for (int i = 0; i < listBuku.size(); i++) {
            Buku buku = listBuku.get(i);
            if(buku instanceof BukuDiktat) {
               BukuDiktat diktat = (BukuDiktat)buku;
               System.out.println("id: " + diktat.getIdBuku() + ", penerbit: " + diktat.getPenerbit() + 
                       ", judul: " + diktat.getJudul() + ", pengarang: " + diktat.getPengarang());
            }
            if(buku instanceof Majalah) {
               Majalah majalah = (Majalah)buku;
               System.out.println("id: " + majalah.getIdBuku() + ", penerbit: " + majalah.getPenerbit() + 
                       ", nama: " + majalah.getNamaMajalah()+ ", edisi: " + majalah.getEdisi());
            }
        }
    }
    
}
