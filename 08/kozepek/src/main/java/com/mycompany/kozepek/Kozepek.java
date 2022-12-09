/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kozepek;

import java.io.*;
/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-02
 */
public class Kozepek {
    
    public static void main(String[] args) throws IOException {
        int szam1 = -1, szam2 = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            if (szam1 < 0) {
                System.out.print("Add meg az első pozitív egész számot: ");
                szam1 = Integer.parseInt(br.readLine());
            }
            if (szam2 < 0) {
                System.out.print("Add meg a második pozitív egész számot: ");
                szam2 = Integer.parseInt(br.readLine());
            }
        } while (szam1 < 0 || szam2 < 0);
        
        System.out.println("A megadott számok számtani közepe: " + ((szam1 + szam2)/2));
        System.out.println("A megadott számok mértani közepe: " + Math.sqrt(szam1 * szam2));
    }
}
