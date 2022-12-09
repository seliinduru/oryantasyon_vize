/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orthesapla;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class OrtHesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // girilen üç dğerin ortalamasını hesaplayacağız
        //* scanner nesnesi oluşturmmamız lazım en başta *//
        Scanner input = new Scanner(System.in);
        
                //kullanıcıdan üç sayı girmesini isteyeceğiz//
                System.out.print("uc sayi giriniz: ");
                double sayi1 = input.nextDouble();
                double sayi2 = input.nextDouble();
                double sayi3 = input.nextDouble();
                
                //ortalamayı hesaplıyoruz şimdi de
                double ortalama = ((sayi1+sayi2+sayi3)/3);
                
                //sonucu gösteririz
                System.out.println("ortalama"+ortalama);
                

                
        
    }
    
}
