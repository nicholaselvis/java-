/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11_nicholas;

/**
 *
 * @author Praktikan
 */
public class Persegi extends BangunDatar {
    
    private double sisi;
    
    public Persegi(double sisi, String warna){
        this.sisi = sisi;
        this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public String getWarna() {
        return this.warna;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double keliling(){
        return 4 * sisi;
    }
    
    @Override
    public double luas(){
        return sisi * sisi;
    } 
    @Override
    public void print(){
    System.out.println("Persegi" );
    System.out.println("Warna : " + getWarna());
    System.out.println("Sisi : " + sisi);
    System.out.println("Luas : " + luas());
    System.out.println("Keliling : " + keliling());
    System.out.println();
    }
}
