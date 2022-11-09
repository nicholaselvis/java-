/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_nicholas;

/**
 *
 * @author Praktikan
 */
public class Praktikum10_Nicholas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar("Hitamm");
        System.out.println("Warna : " + bd.getWarna());
        System.out.println();
        
        BangunDatar lingkaran = new Lingkaran("Merah", 26.0);
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println();
        
        BangunDatar segitiga = new Segitiga("Kuning", 15, 7);
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println();
        
        BangunDatar segiempat = new SegiEmpat("Hijau", 10);
        System.out.println("Luas Segi Empat : " + segiempat.luas());
        System.out.println("Keliling Segi Empat : " + segiempat.keliling());
        System.out.println();
        
    }
    
}
