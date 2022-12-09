/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.masodfoku_megoldhato;
import java.io.*;

/**
 *
 * @author szeke
 */
public class Masodfoku_megoldhato {

    public static void main(String[] args) throws IOException {
        double a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Adja meg az együtthatókat:");
        System.out.print("A: "); a = Double.parseDouble(br.readLine());
        System.out.print("B: "); b = Double.parseDouble(br.readLine());
        System.out.print("C: "); c = Double.parseDouble(br.readLine());
        
        if( (b*b - 4*a*c) > 0 )
            System.out.println("Az egyenletnek van megoldása");
        else
            System.out.println("Nincs megoldás");
        
    }
}
