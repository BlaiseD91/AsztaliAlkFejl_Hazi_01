/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.koszontes;
import java.io.*;

/**
 *
 * @author BlaiseD91
 */
public class Koszontes {

    public static void main(String[] args) throws IOException {
        String nev = "";
        
        System.out.print("Add meg a felhasználóneved: ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        nev = br.readLine();
        
        System.out.println("Üdvözöllek " + nev + "!");
    }
}
