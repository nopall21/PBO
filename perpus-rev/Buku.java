class Buku {
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