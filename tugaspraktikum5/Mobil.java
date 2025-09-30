  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class Mobil extends kendaraandarat {
    int KapasitasPenumpang;
    
    public Mobil(String nama, int kecepatan, int jumlahroda, int KapasitasPenumpang) {
        super(nama, kecepatan, jumlahroda);
        this.KapasitasPenumpang = KapasitasPenumpang;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Penumpang: " + KapasitasPenumpang);
    }
}
