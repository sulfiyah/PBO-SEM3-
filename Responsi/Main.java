/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
        Elektronik kulkas = new Elektronik("Kulkas", 20000000, 2);
        Makanan snack = new Makanan("Snack", 15000, "11-01-2030");

        PegawaiTetap Pikri = new PegawaiTetap("Pikri", 500000000, 10000000);
        PegawaiKontrak Bayam = new PegawaiKontrak("Bayam", 9000000, 12);

        System.out.println("===<3 Output Produk <3===");
        kulkas.tampilkanInfo();

        System.out.println("\n===<3 Output Pegawai <3===");
        Pikri.tampilkanInfo();

        System.out.println("\n===<3 Output Polimorfisme <3===");
        Produk produk = snack;      
        Pegawai pegawai = Bayam;     
        produk.tampilkanInfo();
        System.out.println();
        pegawai.tampilkanInfo();
    }
}

