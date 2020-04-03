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
public class Internship {
        public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int x = lc.nextInt();
        double n[] = new double[x], n0;
        double c[] = new double[x], c0;

        for (int i = 0; i < x; i++) {
            n0 = lc.nextDouble();
            c0 = lc.nextDouble();
            n[i] = n0;
            c[i] = c0;
        }

        System.out.printf("%.4f",api(n, c));
    }

    public static double api(double[] n, double[] c) {
        double numerador = 0, denominador = 0, api = 0;
        for (int i = 0; i < n.length; i++) {
            numerador = numerador + (n[i] * c[i]);
            denominador = denominador + (c[i] * 100);
        }
        return numerador / denominador;
    }

}
