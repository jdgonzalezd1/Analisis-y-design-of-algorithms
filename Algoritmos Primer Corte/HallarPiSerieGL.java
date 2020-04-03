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
public class HallarPiSerieGL {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        double pi = 4, den = 1;
        int i = 0, cont = 0;
        System.out.println("¿Número de repeticiones?");
        i = lc.nextInt();
        for (int j = 0; j < i; j++) {
            if (cont == 0) {
                den = den + 2;
                pi = pi - (pi / (den));
                cont--;
            } else {
                den = den + 2;
                pi = pi + (pi / (den));
                cont++;
            }
        }
        System.out.println(pi);
    }

}
