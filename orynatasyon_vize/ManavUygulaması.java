/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manavuygulaması;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ManavUygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // öncelikle scanner tanımlaması yap
        Scanner input = new Scanner(System.in);
        
        System.out.println("MERHABA! \n MANAV UYGULAMASINA HOSGELDINIZ!");
        System.out.println("KASAYA GITMEDEN TOPLAM FIYATI OGRENIN!");
        
        System.out.println("Kac kilo elma alacaksiniz?");
        int elmaKg = input.nextInt();
        int elmaFiyat = 5*elmaKg;
        
        System.out.println("Kac kg muz alacaksiniz?");
        int muzKg = input.nextInt();
        int muzFiyat = 12*muzKg;
        
        System.out.println("Nar fiyatlarinda muthis indirim! \n Kac kg nar alacaksiniz?");
        int narKg = input.nextInt();
        int narFiyat = 21*narKg;
        
        System.out.println("Kac kg portakal alacaksiniz?");
        int portakalKg = input.nextInt();
        int portakalFiyat = 14*muzKg;
        
        int hesap = elmaFiyat+muzFiyat+narFiyat+portakalFiyat;
                System.out.println("HESAP=" + hesap + "TL");
                System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ!");
        

        
        
                

        
    }
    
}
