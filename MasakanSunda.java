/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_OOP;

/**
 *
 * @author DITA
 */
public class MasakanSunda {
    String bahanUtama;
    String caraMembuat;
    
    public MasakanSunda(String bahanUtama, String caraMembuat) {
        this.bahanUtama = bahanUtama;
        this.caraMembuat = caraMembuat;
    }
    
    // Method infoResep
    public void infoResep() {
        System.out.println("---------- Resep Makanan Khas Sunda ---------\n");
        System.out.println("----- |Resep Masakan " + getClass().getSimpleName() + "| -----");
        System.out.println("Bahan Utama: ");
        System.out.println(bahanUtama);
//        System.out.println("Cara Membuat: " + caraMembuat);
    }
}
