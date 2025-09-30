/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Pretty";
        k.jenis = "Kampung";
        k.tampilkanInfo();
        
        Sapi s = new Sapi();
        s.nama = "Pipi";
        s.jenis = "Limousin";
        s.tampilkanInfo();
    }
    
}
