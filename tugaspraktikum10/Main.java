/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @author hp
     */
    public static void main(String[] args) {

        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 500000; 
        double hargaMakanan = 7000;     

        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}

