/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KursusModel;

/**
 *
 * @author Asus
 */
public class ModelKursus {
    // properties (dengan encapsulation)
    private String idKursus;
    private String namaKursus;
    private String pengajar;
    private int durasi; // dalam jam

    // Constructor
    public ModelKursus(String idKursus, String namaKursus, String pengajar, int durasi) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.pengajar = pengajar;
        this.durasi = durasi;
    }

    // Getter & Setter
    public String getIdKursus() { return idKursus; }
    public void setIdKursus(String idKursus) { this.idKursus = idKursus; }

    public String getNamaKursus() { return namaKursus; }
    public void setNamaKursus(String namaKursus) { this.namaKursus = namaKursus; }

    public String getPengajar() { return pengajar; }
    public void setPengajar(String pengajar) { this.pengajar = pengajar; }

    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }

    @Override
    public String toString() {
        return "ID: " + idKursus + " | Nama: " + namaKursus + " | Pengajar: " + pengajar + " | Durasi: " + durasi + " jam";
    }
}
