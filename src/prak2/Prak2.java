/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

/**
 *
 * @author ASUS
 */
public class Prak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int a = 4;
        //perulangan
        for (int i = 1; i <= a; i++) {
            for(int u=1; u<=i; u++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
