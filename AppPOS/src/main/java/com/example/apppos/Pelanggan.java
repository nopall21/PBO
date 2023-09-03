package com.example.apppos;

public class Pelanggan {
    private String nama;
    private String alamat;
    private String idpelanggan;

    public Pelanggan(){
    }

    public Pelanggan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Pelanggan(String idpelanggan, String nama, String alamat){
        this.idpelanggan = idpelanggan;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {

        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getIdpelanggan() {
        return idpelanggan;
    }
    public void setIdpelanggan(String idpelanggan){
        this.idpelanggan = idpelanggan;
    }
}
