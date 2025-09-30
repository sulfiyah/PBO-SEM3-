 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class SepedaMotor extends kendaraandarat {
    String jenisMotor;

    public SepedaMotor(String nama, int kecepatan, int jumlahRoda, String jenisMotor) {
        super(nama, kecepatan, jumlahRoda);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}
