/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author hp
 */
public class Kucing extends Hewan{
    String suarakucing = "Meow~";
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing: " + suarakucing);
    }
    
}
 