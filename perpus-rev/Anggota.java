import java.util.ArrayList;

class Anggota {
  public String idAnggota;
  public String namaAnggota;
  public ArrayList<Buku> listBuku = new ArrayList<>();

  public Anggota(String idAnggota, String namaAnggota) {
    this.idAnggota = idAnggota;
    this.namaAnggota = namaAnggota;
  }

  public void addBuku(Buku b) {
    listBuku.add(b);
  }

  public void displayBukuDipinjam() {
    System.out.println("Buku yang dipinjam oleh " + namaAnggota + ":");
    for (Buku b : listBuku) {
      if (b.getStatusPinjam()) {
        System.out.print("- ");
        if (b instanceof BukuDiktat) {
          BukuDiktat bd = (BukuDiktat) b;
          System.out.println("ID: " + bd.getIdBuku() + " - Penerbit: " + bd.getPenerbit() + " - Judul: " + bd.getJudul() + " - Pengarang: " + bd.getPengarang());
        } else if (b instanceof Majalah) {
          Majalah m = (Majalah) b;
          System.out.println("ID: " + m.getIdBuku() + " - Penerbit: " + m.getPenerbit() + " - Nama Majalah: " + m.getNamaMajalah() + " - Edisi: " + m.getEdisi());
        } else {
          System.out.println("ID: " + b.getIdBuku() + " - Penerbit: " + b.getPenerbit());
        }
      }
    }
  }

}