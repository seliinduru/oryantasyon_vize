/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifblokları;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ifblokları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("oyunu kazanmak icin hangi sayidan buyuk deger girmeniz gerekiyor? \n haydi baSlayalim!");
        System.out.println("1. sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz:");
        int sayi2 = input.nextInt();
         int toplam = sayi1 + sayi2;
          if (toplam>25){
              System.out.println("KAZANDINIZ!");
          }else{
              System.out.println("KAYBETTINIZ!");
          }
         
    }
    
}
