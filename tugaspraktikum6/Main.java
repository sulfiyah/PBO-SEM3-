/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author supil
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        Produk buku = new Buku("Java Programming", 100000);
        Produk laptop = new Elektronik("Laptop hp", 8000000);
        Produk baju = new Pakaian("Cardigan", 150000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(baju);

        keranjang.tampilkanProduk();
        System.out.println("==================================");
        System.out.println("Total yang harus dibayar: Rp " + keranjang.hitungTotal());
    }
}

