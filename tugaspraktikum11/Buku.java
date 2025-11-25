/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author hp
 */
public class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi: Buku punya Pengarang, tapi Pengarang tetap mandiri

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Pengarang  : " + pengarang.getNamaPengarang());
        System.out.println("-----------------------------------");
    }
}
