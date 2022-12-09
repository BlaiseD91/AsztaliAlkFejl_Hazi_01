/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nagyobb;
import java.io.*;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-03
 */
public class Nagyobb {

    public static void main(String[] args) throws IOException {
        int szam1, szam2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg az első számot: ");
        szam1 = Integer.parseInt(br.readLine());
        
        System.out.print("Add meg a második számot: ");
        szam2 = Integer.parseInt(br.readLine());
        
        if (szam1 > szam2) {
            System.out.println("A nagyobb szám a(z) " + szam1);
        }
        else if (szam2> szam1) {
            System.out.println("A nagyobb szám a(z) " + szam2);
        }
        else {
            System.out.println("A két szám egyenlő");
        }
    }
}
