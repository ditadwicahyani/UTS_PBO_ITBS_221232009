/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_OOP;

/**
 *
 * @author DITA
 */
public class mieKocokBandung extends MasakanSunda {
    //Atribut
    String bahanKuah;
    String bumbuHalus;
    String bahanSambal;
    String bahanPelengkap;
    
    // Overloading Construstor
    public mieKocokBandung(String bahanUtama, String bahanKuah, String bumbuHalus, String bahanSambal, String bahanPelengkap, String caraMembuat) {
        super(bahanUtama, caraMembuat);
        this.bahanKuah = bahanKuah;
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }
    
    @Override
    public void infoResep() {
        super.infoResep();
        System.out.println("Bahan Kuah: ");
        System.out.println(bahanKuah);
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
