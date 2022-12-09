/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package işlemler3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Işlemler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner ile girilen sayılarla işlemler yapacğız 
        Scanner input =new Scanner(System.in);
        System.out.println("1.sayiyi giriniz:");
        int sayi1= input.nextInt();
        System.out.println("2.sayiyi giriniz:");
        int sayi2=input.nextInt();  
                System.out.println("3.sayiyi giriniz:");
                int sayi3=input.nextInt();
                int toplam;
                toplam = sayi1*sayi2+sayi3;
                
                System.out.println("toplam="+toplam);

    }
    
}
