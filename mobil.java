/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author hp
 */
public class mobil extends Kendaraan {
    private int JumlahPintu;  
    
    // Constructor
    public mobil (String Nama, int KecepatanMaks, String BahanBakar, int JumlahPintu) {
        super (Nama, KecepatanMaks, BahanBakar);
        this.JumlahPintu = JumlahPintu;
    }
    
    //Metode untuk menampilkan informasi mobil
    public void tampilkanInfomobil() {
        //Dapat mengakses KecepatanMaks karena protected
        System.out.println("\nNama Mobil: " + Nama);
        System.out.println("Kecepatan Maksimum Mobil: " + KecepatanMaks + " km/h");
        System.out.println("Bahan Bakar: " + BahanBakar);
        System.out.println("Jumlah Pintu: " + JumlahPintu);
    }
}
