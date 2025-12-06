/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum12;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemBuku {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Buku> bukuList = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Buku (simpan ke buku.txt)");
            System.out.println("2. Simpan Objek Buku ke buku.ser");
            System.out.println("3. Tampilkan Buku dari buku.txt");
            System.out.println("4. Tampilkan Buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> tambahBukuTxt(sc);
                case 2 -> tambahBukuSerial(sc);
                case 3 -> tampilkanDariTxt();
                case 4 -> tampilkanDariSerial();
                case 5 -> {
                    System.out.println("Program selesai.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // --- Simpan ke TXT ---
    private static void tambahBukuTxt(Scanner sc) {
        try (FileWriter fw = new FileWriter(TEXT_FILE, true)) {
            System.out.print("Judul: ");
            String j = sc.nextLine();
            System.out.print("Pengarang: ");
            String p = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int t = sc.nextInt();
            sc.nextLine();

            Buku buku = new Buku(j, p, t);

            fw.write(buku.toString() + "\n");
            System.out.println("Buku berhasil disimpan ke buku.txt.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
        }
    }

    // --- Simpan ke SERIAL (buku.ser) ---
    private static void tambahBukuSerial(Scanner sc) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            System.out.print("Judul: ");
            String j = sc.nextLine();
            System.out.print("Pengarang: ");
            String p = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int t = sc.nextInt();
            sc.nextLine();

            Buku buku = new Buku(j, p, t);

            oos.writeObject(buku);
            System.out.println("Buku berhasil disimpan ke buku.ser.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file serial.");
        }
    }

    // --- Baca dari TXT ---
    private static void tampilkanDariTxt() {
        System.out.println("\nIsi buku.txt:");
        try (BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat membaca buku.txt.");
        }
    }

    // --- Baca dari SERIAL ---
    private static void tampilkanDariSerial() {
        System.out.println("\nIsi buku.ser:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            Buku b = (Buku) ois.readObject();
            System.out.println(b.toString());
        } catch (Exception e) {
            System.out.println("Tidak dapat membaca buku.ser.");
        }
    }
}

