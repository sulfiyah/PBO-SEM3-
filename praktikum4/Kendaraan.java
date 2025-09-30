/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author hp
 */
public class Kendaraan {
    //atribut dengan akses modifier berbeda
    public String Nama;
    protected int KecepatanMaks;
    public String BahanBakar;
    
    // Constructor 
    public Kendaraan (String Nama, int KecepatanMaks, String BahanBakar) {
        this.Nama = Nama;
        this.KecepatanMaks = KecepatanMaks;
        this.BahanBakar = BahanBakar;
    }
       // Getter dan Setter untuk variabel private nama
       public String getNama() {
            return Nama;
       }
       public void setNama (String Nama) {
            this.Nama = Nama;
       }
    
        // Metode public untuk menampilkan informasi kendaraan
        public void tampilkanInfoKendaraan() {
            System.out.println("Nama Kendaraan: " + Nama);
            System.out.println("Kecepatan Maksimum: " + KecepatanMaks + " km/h");
            System.out.println("Bahan Bakar: " + BahanBakar);
        }    
    }
