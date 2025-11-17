/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author supil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek Penjumlahan 
        OperasiHitung penjumlahan = new Penjumlahan(); 
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));  // Output: 15 
 
        // Objek Pengurangan 
        OperasiHitung pengurangan = new Pengurangan(); 
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5));  // Output: 5 
    } 
}
