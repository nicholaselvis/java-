/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12_nicholas;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Praktikum12_Nicholas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();
        
        
        System.out.println(nilai);
        
        Mahasiswa mhs1 = new Mahasiswa("Nicholas", "2117051053", nilai);
        
        mhs1.nilaiRataRata();
    }
    
}
