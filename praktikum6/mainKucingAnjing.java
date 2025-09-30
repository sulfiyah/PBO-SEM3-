/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author hp
 */
public class mainKucingAnjing {
    public static void main(String[] args) {
        
        Kucing kucing = new Kucing();
        kucing.bersuara();              //Output: Meow
        kucing.makan("ikan");           // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 3);        // Memanggil metode makan() yang overloaded 
        
        Anjing anjing = new Anjing();
        anjing.bersuara();              //Output: Woof
        anjing.makan("daging", 3);
    }
}
