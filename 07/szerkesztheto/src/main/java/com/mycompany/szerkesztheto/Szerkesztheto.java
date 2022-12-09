/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.szerkesztheto;
import java.io.*;

/**
 *
 * @author Székely Balázs Csaba, BliseD91
 * @date 2022-12-02
 */
public class Szerkesztheto {

    public static void main(String[] args) throws IOException {
        double a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg az 'a' oldal hosszát (cm): ");
        a = Double.parseDouble(br.readLine());
        
        System.out.print("Add meg az 'b' oldal hosszát (cm): ");
        b = Double.parseDouble(br.readLine());
        
        System.out.print("Add meg az 'c' oldal hosszát (cm): ");
        c = Double.parseDouble(br.readLine());
        
        if ((a+b < c) && (a+c < b) && (b+c < a))
            System.out.println("A háromszög megszerkeszthető");
        else
            System.out.println("A háromszög nem szerkeszthető meg");
    }
}
