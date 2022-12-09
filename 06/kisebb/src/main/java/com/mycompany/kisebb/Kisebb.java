/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kisebb;
import java.io.*;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-02
 */
public class Kisebb {

    public static void main(String[] args) throws IOException {
        int szam1, szam2, szam3;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Adja meg az első számot: ");
        szam1 = Integer.parseInt(br.readLine());
        
        System.out.print("Adja meg a második számot: ");
        szam2 = Integer.parseInt(br.readLine());
        
        System.out.print("Adja meg a harmadik számot: ");
        szam3 = Integer.parseInt(br.readLine());
        
        if (szam1 < szam2) {
            if (szam1 < szam3)
                System.out.println("A legkisebb szám: " + szam1);
            else
                System.out.println("A legkisebb szám: " + szam3);
        }
        else if (szam2 < szam3)
            System.out.println("A legkisebb szám: " + szam2);
        else
            System.out.println("A legkisebb szám: " + szam3);
    }
}
