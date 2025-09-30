/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author hp
 */
public class Pekerja extends manusia {
    private double gaji;

    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + " tahun\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: Rp " + gaji;
    }
}



