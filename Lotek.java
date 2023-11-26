/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_OOP;

/**
 *
 * @author DITA
 */
public class Lotek extends MasakanSunda {
    String bumbuHalus;
    
    // Konstruktor menggunakan Overloading
    public Lotek(String bahanUtama, String bumbuHalus, String caraMembuat) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
    }
    
    // Method infoResep menggunakan Overriding
    @Override
    public void infoResep() {
        super.infoResep();
        System.out.println("Bumbu Halus: ");
        System.out.println(bumbuHalus);
        System.out.println("Cara Membuat: ");
        System.out.println(caraMembuat);
    }
    
}
