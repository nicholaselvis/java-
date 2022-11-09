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
public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    public Segitiga(String warna, double alas, double tinggi){
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas(){
        return this.alas * this.tinggi / 2;
    }
    
    @Override
    public double keliling(){
        return 3*alas;
    }
    
    public double getAlas(){
        return alas;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void setAlas(double alas){
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
}
