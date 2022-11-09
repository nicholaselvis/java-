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
public class Praktikum11_nicholas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10, "PINK");
        BangunDatar segitiga = new Segitiga(13, 5, "PUTIH");
        BangunDatar persegi = new Persegi(5, "COKELAT");
        
        BangunDatar[] bangundatar = new BangunDatar[3];
        bangundatar[0] = lingkaran;
        bangundatar[1] = segitiga;
        bangundatar[2] = persegi;
        
        for(int i = 0; i<3; i++){
            bangundatar[i].print();
        
        }
    }
}
