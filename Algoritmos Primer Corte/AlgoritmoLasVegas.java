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
public class AlgoritmoLasVegas {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int naipe = 0, res = 0, opc, res2 = 0, naipe2 = 0;
        boolean flag = false;
        System.out.println("Bienvenido a BJO (BlackJack Online)\n"
                + "1. Jugar\n"
                + "Presione otro numero para salir");
        opc = lc.nextInt();
        if (opc == 1) {
            do {
                if (res2 < 21) {
                    naipe2 = (int) Math.floor(Math.random() * 11 + 1);
                    res2 = res2 + naipe2;
                } else if (res2 == 21 || res2 > 21) {
                }
                naipe = (int) Math.floor(Math.random() * 11 + 1);
                res = res + naipe;
                System.out.println("Naipe: " + naipe + " Total = " + res + "\n"
                        + "¿Seguir?\n"
                        + "1. Pedir\n"
                        + "2. Terminar");
                opc = lc.nextInt();
                if (opc == 1) {
                } else {
                    flag = true;
                }
            } while (flag == false);
            if (res <= 21 && res2 < res || res2 > 21) {
                System.out.println("Resultado del jugador = " + res + "\n"
                        + "Resultado de la casa = " + res2 + "\n");
                System.out.println("Has Ganado!");
            } else if (res2 <= 21 && res < res2 || res > 21) {
                System.out.println("Resultado del jugador = " + res + "\n"
                        + "Resultado de la casa = " + res2 + "\n");
                System.out.println("Has Perdido");
            } else if (res2 > 21 && res > 21 || res == res2) {
                System.out.println("Resultado del jugador = " + res + "\n"
                        + "Resultado de la casa = " + res2 + "\n");
                System.out.println("Empate!");
            }
        } else {
            System.out.println("Hasta pronto");
        }
    }

}
