package utspbo;

public class Buku {
    
    String idBuku, penerbit;
    char statusPinjam;

    public Buku(String idBuku, String penerbit) {
        this.idBuku = idBuku;
        this.penerbit = penerbit;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public boolean getStatusPinjam(){
        if(statusPinjam == 'y'){
            return true;
        }
        return false;
    }
    
}
