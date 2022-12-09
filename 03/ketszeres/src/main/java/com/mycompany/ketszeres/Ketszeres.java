/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ketszeres;
import java.io.*;
/**
 *
 * @author szeke
 */
public class Ketszeres {

    public static void main(String[] args) throws IOException {
        System.out.print("Adj meg egy számot: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double szam = 0;
        
        szam = Double.parseDouble(br.readLine());
        System.out.print(szam*2);
    }
}
