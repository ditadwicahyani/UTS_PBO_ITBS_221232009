/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_OOP;

/**
 *
 * @author DITA
 */
public class sateMaranggi extends MasakanSunda {
    // Atribut tambahan
    private String bumbuHalus;
    private String bahanSambal;
    private String bahanPelengkap;
    
    // Konstruktor menggunakan Overloading
    public sateMaranggi(String bahanUtama, String bumbuHalus, String bahanSambal, String bahanPelengkap, String caraMembuat) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }
    
    // Method infoResep menggunakan Overriding
    @Override
    public void infoResep() {
        super.infoResep();
        System.out.println("Bumbu Halus: ");
        System.out.println(bumbuHalus);
        System.out.println("Bahan Sambal: ");
        System.out.println(bahanSambal);
        System.out.println("Bahan Pelengkap: ");
        System.out.println(bahanPelengkap);
        System.out.println("Cara Membuat: ");
        System.out.println(caraMembuat);
    }
    
}
