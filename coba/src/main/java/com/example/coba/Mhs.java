package com.example.coba;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;


public class Mhs {
    private String nim;
    private String nama;
    private ObjectProperty<LocalDate> tgl_lahir;

    public Mhs(String nim, String nama, LocalDate tgl_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.tgl_lahir = new SimpleObjectProperty(this, "tglLahir", tgl_lahir);
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public LocalDate getTgl_lahir() {
        return (LocalDate)this.tgl_lahir.get();
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ObjectProperty<LocalDate> tglLahirProperty() {
        return this.tgl_lahir;
    }

    public void setTgl_lahir(LocalDate tgl_lahir) {
        this.tgl_lahir.setValue(LocalDate.of(tgl_lahir.getYear(), tgl_lahir.getMonth(), tgl_lahir.getDayOfMonth()));
    }

    public void remove() {
    }
}

