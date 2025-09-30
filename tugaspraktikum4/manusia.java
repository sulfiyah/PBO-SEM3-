/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author hp
 */
// Atribut
public class manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;  

    // Constructor
    public manusia (String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    //Getter dan Setter nama
    public String getNama() {
        return nama;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
}
    