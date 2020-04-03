/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author juan3
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int j, n, sec;
        System.out.println("¿Número n-ésimo de la serie?");
        sec = lc.nextInt();
        int Fibo[] = new int[sec];

        Fibo[0] = 0;
        Fibo[1] = 1;
        for (int i = 2; i < Fibo.length; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        System.out.println("La secuancia Fibonacci con "+sec+" digitos es: ");
        for (int i = 0; i <= Fibo.length - 1; i++) {
            System.out.print("[" + Fibo[i] + "]");
        }
    }

}
