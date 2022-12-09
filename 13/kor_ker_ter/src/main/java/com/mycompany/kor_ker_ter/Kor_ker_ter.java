/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kor_ker_ter;
import java.io.*;
/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-04
 */
public class Kor_ker_ter {

    public static void main(String[] args) throws IOException {
        double sugar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg a kör sugarát (cm): ");
        sugar = Double.parseDouble(br.readLine());
        
        System.out.printf("A kör kerülete: %.2f cm\n", (Math.PI*2*sugar));
        System.out.printf("A kör területe: %.2f cm2", (Math.PI*sugar*sugar));
    }
}
