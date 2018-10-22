/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan nama User 
 * sesuai dengan jumlah yang user ingikan yang di input melalui keyboard user
 */
public class PBO310117104Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer P = new Printer();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.printf("Masukkan nama anda : ");
        P.setNama(scn.nextLine());
        System.out.printf("Mau Cetak nama anda berapa kali ? : ");
        P.setJmlCetak(scn.nextInt());
        P.cetak(P.getNama());
        System.out.println("Hasil Cetak : ");
        P.cetak(P.getJmlCetak(),P.getNama());
    
    
    }
    
}
