/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.szamolo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author BlaiseD91
 */
public class Szamolo {

    public static void main(String[] args) throws IOException {
        double szam1, szam2;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg az első számot: ");
        szam1 = Double.parseDouble(br.readLine());
        
        System.out.print("Add meg a második számot: ");
        szam2 = Double.parseDouble(br.readLine());
        
        System.out.printf("A két szám összege: %.4f\n", (szam1+szam2));
        System.out.printf("A két szám különbsége: %.4f\n", (szam1-szam2));
        System.out.printf("A két szám szorzata: %.4f\n", szam1*szam2);
        System.out.printf("A két szm hányadosa: %.4f", szam1/szam2);
        
    }
}
