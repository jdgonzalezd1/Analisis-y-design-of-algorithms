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
public class PomekonsBattle {

    public static void main(String[] args) {
        double valores[] = new double[2];
        double at, df, lv, v, b;
        Scanner lc = new Scanner(System.in);
        int n = lc.nextInt();
        String resultados[] = new String[n];
        int aux = 0;
        while (n > 0) {
            b = lc.nextInt();
            for (int i = 0; i < 2; i++) {
                at = lc.nextDouble();
                df = lc.nextDouble();
                lv = lc.nextDouble();
                if (lv % 2 == 0) {
                    v = (at + df) / 2 + b;
                } else {
                    v = (at + df) / 2;
                }
                valores[i] = v;
            }
            if (valores[0] > valores[1]) {
                resultados[aux] = "Dabriel";
            } else if (valores[0] < valores[1]) {
                resultados[aux] = "Guarte";
            } else {
                resultados[aux] = "Empate";
            }
            n--;
            aux++;
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }

}
