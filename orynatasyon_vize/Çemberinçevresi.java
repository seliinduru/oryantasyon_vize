/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çemberinçevresi;

import java.util.Scanner;


public class Çemberinçevresi {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);
        System.out.println("cemberin cevresini hesaplamaya geldiniz! \n hadi baslayalim");
        System.out.println("Yaricap degerini girin:");
        
        int yaricap=input.nextInt();
        int pi=3;
        int cevre=2*pi*yaricap;
        System.out.println("cemberin cevresi:"+ cevre);
        
    }
    
}
