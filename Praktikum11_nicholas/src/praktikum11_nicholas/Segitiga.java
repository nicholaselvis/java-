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
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi, String warna){
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public double getAlas() {
        return alas;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public String getWarna() {
        return this.warna;
    }
    
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
     
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double keliling(){
        return alas * 3;
    }
    
    @Override
    public double luas(){
        return alas * tinggi / 2;
    }
    
    @Override
    public void print(){
    System.out.println("Segitiga" );
    System.out.println("Warna : " + getWarna());
    System.out.println("Alas : " + alas);
    System.out.println("Tinggi : " + tinggi);
    System.out.println("Luas : " + luas());
    System.out.println("Keliling : " + keliling());
    System.out.println();
    }
}
