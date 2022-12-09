/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.felszin_terfogat;
import java.io.*;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-04
 */
public class Felszin_terfogat {

    public static void main(String[] args) throws IOException {
        
        double szelesseg, magassag, melyseg;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg a téglatest szélességét (cm): ");
        szelesseg = Double.parseDouble(br.readLine());
        System.out.print("Add meg a téglatest magasságát (cm): ");
        magassag = Double.parseDouble(br.readLine());
        System.out.print("Add meg a téglatest mélységét (cm): ");
        melyseg = Double.parseDouble(br.readLine());
        
        
        System.out.printf("A téglatest felszíne: %.2f cm2\n", (2*szelesseg*magassag + 2*szelesseg*melyseg + 2*magassag*melyseg));
        System.out.printf("A téglatest térfogata: %.2f cm3", (szelesseg*magassag*melyseg));
        
    }
}
