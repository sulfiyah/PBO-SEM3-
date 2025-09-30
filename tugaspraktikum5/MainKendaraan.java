/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class MainKendaraan {
    public static void main(String[] args) {
        // Objek dari kelas Mobil
        Mobil m = new Mobil("Avanza", 120, 4, 7);
        m.tampilkanInfo();
        System.out.println(); 

        // Objek dari kelas SepedaMotor
        SepedaMotor sm = new SepedaMotor("Vario", 90, 2, "Matic");
        sm.tampilkanInfo();
        System.out.println();

        // Objek dari kelas kendaraandarat
        kendaraandarat truk = new kendaraandarat("Truk", 60, 6);
        truk.tampilkanInfo();
    }
    
}
