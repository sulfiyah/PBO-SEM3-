/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class kendaraandarat extends Kendaraan {
    int jumlahroda;
    
    public kendaraandarat(String nama, int kecepatan, int jumlahroda) {
        super(nama, kecepatan);
        this.jumlahroda = jumlahroda;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahroda);
    }
    
}
