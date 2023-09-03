import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Mhs {
    private String nim;
    private String nama;
    private ObjectProperty<LocalDate> tgl_lahir;
    public Mhs(String nim, String nama, LocalDate tgl_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.tgl_lahir = new SimpleObjectProperty<LocalDate>(this, "tglLahir",tgl_lahir);
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public LocalDate getTgl_lahir() {
        return tgl_lahir.get();
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public ObjectProperty<LocalDate> tglLahirProperty() {
        return tgl_lahir;
    }

    public void setTgl_lahir(LocalDate tgl_lahir) {
        this.tgl_lahir.setValue(LocalDate.of(tgl_lahir.getYear(), tgl_lahir.getMonth(), tgl_lahir.getDayOfMonth()));
    }
    public void remove() {
    }

    

}
