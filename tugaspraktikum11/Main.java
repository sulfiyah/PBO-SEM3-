/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat pengarang (agregasi → pengarang berdiri sendiri)
        Pengarang p1 = new Pengarang("Jeon Jungkook");
        Pengarang p2 = new Pengarang("BTS");
        Pengarang p3 = new Pengarang("Kim Namjoon");

        // Membuat buku dan menghubungkannya dengan pengarang
        Buku b1 = new Buku(" Shot Glass of Tears", p1);
        Buku b2 = new Buku("Love Maze", p2);
        Buku b3 = new Buku("Right People, Wrong Place", p3);

        // Membuat perpustakaan (komposisi → perpustakaan memiliki buku)
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        // Menampilkan semua buku
        perpustakaan.infoPerpustakaan();
    }
}