/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuvvethesabı;

import java.util.Scanner;


public class Kuvvethesabı {


    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("kutle degerini giriniz: ");
        int m=scanner.nextInt();       
        System.out.println("ivme degerini giriniz: ");
        int a=scanner.nextInt();   
        int F=m*a;
        System.out.println(" kuvvet= "+F);
    }
    
}
