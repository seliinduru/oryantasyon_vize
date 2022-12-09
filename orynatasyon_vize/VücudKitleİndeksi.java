/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vücudkitleindeksi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VücudKitleİndeksi {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen boyunuzu(metre cinsinden)giriniz : ");
        double boy = scan.nextDouble();
        
        System.out.print("lutfen kilonuzu giriniz : ");
        double kilo = scan.nextDouble();
        
        double indeks = kilo / (boy*boy);
        
        System.out.println("Vucut Kitle Indeksiniz : " + indeks);
               
     
    }
    
}
