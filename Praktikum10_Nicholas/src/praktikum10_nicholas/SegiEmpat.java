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
public class SegiEmpat extends BangunDatar {
    double sisi;
    public SegiEmpat(String warna, double sisi){
        super(warna);
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        return sisi*sisi;
    }
    
    @Override
    public double keliling(){
        return 4*sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
}
