/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author hp
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Pekerja dan inisialisasi
        Pekerja p = new Pekerja("Pikri", 25, "Direktur", 1000000000);

         // Menampilkan informasi pekerja menggunakan toString
        System.out.println(p.toString());
        
        // Mengubah nama menggunakan setter
        p.setNama("Pipi");

        // Mengubah nama pekerja menggunakan setter
        System.out.println("\nSetelah nama diubah:");
        System.out.println(p);

    }
}
   

