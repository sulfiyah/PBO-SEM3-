/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author supil
 */
public class Main {
      public static void main(String[] args) {
        // membuat objek mobil
        mobil mobil1 = new mobil("Mclaren", "MCL39", 2025, "Orange");
        mobil mobil2 = new mobil("Audi", "R8", 2025, "Dayton Grey");

        // menampilkan info mobil
        mobil1.displayInfo();
        mobil2.displayInfo();

        // menyalakan mesin
        mobil1.startEngine();
        mobil2.startEngine();

        // ubah warna mobil1
        mobil1.setWarna("Hitam");
        System.out.println("Setelah diubah warna:");
        mobil1.displayInfo();
      }
}
