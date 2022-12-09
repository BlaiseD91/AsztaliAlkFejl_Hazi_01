/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atfogo;
import java.io.*;

/**
 *
 * @author Székely Balázs Csaba, BlaiseD91
 * @date 2022-12-04
 */
public class Atfogo {

    public static void main(String[] args) throws IOException {
        
        double aBefogo, bBefogo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg az egyik befogót(cm): ");
        aBefogo = Double.parseDouble(br.readLine());
        System.out.print("Add meg a másik befogót(cm): ");
        bBefogo = Double.parseDouble(br.readLine());
        
        System.out.printf("Az átfogó mérete: %.2f cm", (Math.sqrt(aBefogo*aBefogo + bBefogo*bBefogo)));
    }
}
