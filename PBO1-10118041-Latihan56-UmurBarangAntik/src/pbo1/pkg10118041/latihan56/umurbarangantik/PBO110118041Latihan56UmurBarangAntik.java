/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA  : Eki salman sya'bani
 * KELAS : IF 1
 * NIM   : 10118041
 * Deskripsi Program : Program ini untuk membuat tampilan umur barang antik.
 */
public class PBO110118041Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
    }
    
}
