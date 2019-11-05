/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan56.umurbarangantik;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan umut barang antik
 * 
 */
public class PBO11K10118907Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio(234);
        r.setName("Radio AM");
        
        System.out.println("Nama barang antik : "+r.getName());
        r.tampilUmur();
    }
    
}
