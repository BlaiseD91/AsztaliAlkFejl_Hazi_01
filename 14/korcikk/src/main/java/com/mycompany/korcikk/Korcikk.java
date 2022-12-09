/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.korcikk;
import java.io.*;
import java.lang.Math;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-04
 */
public class Korcikk {

    public static void main(String[] args) throws IOException {
        double szog, sugar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg a körcikk sugarát (cm): ");
        sugar = Double.parseDouble(br.readLine());
        System.out.print("Add meg a középponti szöget (fok): ");
        szog = Math.toRadians(Double.parseDouble(br.readLine()));
        
        System.out.printf("A körcikk területe : %.2f cm2\n", 0.5*sugar*sugar*szog);
        System.out.printf("A körív hossza : %.2f cm", sugar*szog);
    }
}
