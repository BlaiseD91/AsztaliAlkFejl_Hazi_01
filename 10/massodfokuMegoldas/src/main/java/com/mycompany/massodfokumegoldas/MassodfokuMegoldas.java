/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.massodfokumegoldas;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-02
 */

import java.io.*;

public class MassodfokuMegoldas {

    public static void main(String[] args) throws IOException {
        
        double a, b, c, x1, x2, sqrtDisc;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Adja meg az együtthatókat:");
        System.out.print("A: "); a = Double.parseDouble(br.readLine());
        System.out.print("B: "); b = Double.parseDouble(br.readLine());
        System.out.print("C: "); c = Double.parseDouble(br.readLine());
        
        if( (b*b - 4*a*c) > 0 ) {
            sqrtDisc = Math.sqrt(b*b - 4*a*c);
            x1 = (-1*b + sqrtDisc) / (2*a);
            x2 = (-1*b - sqrtDisc) / (2*a);
            System.out.printf("Megoldások: %.2f és %.2f", x1, x2);
        }
        else if( (b*b + 4*a*c) == 0 ) {
            sqrtDisc = Math.sqrt(b*b - 4*a*c);
            x1 = (-1*b + sqrtDisc) / (2*a);
            System.out.printf("Megoldások: %.2f", x1);
        }
        else {
            System.out.println("Nincs megoldás");
        }
    }
}
