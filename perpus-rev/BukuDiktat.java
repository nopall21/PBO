class BukuDiktat extends Buku {
  public String judul;
  public String pengarang;

  public BukuDiktat(String idBuku, String penerbit, String judul, String pengarang) {
    super(idBuku, penerbit);
    this.judul = judul;
    this.pengarang = pengarang;
  }

  public String getJudul() {
    return judul;
  }

  public String getPengarang() {
    return pengarang;
  }
}