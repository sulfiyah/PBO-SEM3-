/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author supil
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Pretty", 2);
        kucing.info();
        kucing.suara();
        kucing.berlari();
        
        Hewan anjing = new Hewan ("Bammie", 1);
        anjing.info();
        anjing.suara();
        anjing.berlari();
    }
    
}
