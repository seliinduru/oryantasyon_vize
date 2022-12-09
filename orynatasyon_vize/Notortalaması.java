/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notortalaması;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Notortalaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("KALDIN MI? / GECTIN MI? \n HADI HESAPLAYALIM!");
        Scanner input = new Scanner(System.in);
        System.out.print("vize notunuzu giriniz=");
        int vizeNotu = input.nextInt();
        System.out.print("final notunuzu giriniz=");
        int finalNotu = input.nextInt();
        
        double ortalama = vizeNotu*0.4+finalNotu*0.6;
        
        if(ortalama>=50){
            System.out.println("dersten gectiniz." + "notunuz:" + ortalama);
            
        }else{
            System.out.println("dersten gecemediniz." + "notunuz:" + ortalama);
 
        }
        
    }  
    
}
