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
public class CoordenadasXY {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        double x = lc.nextDouble(), y = lc.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origen");
        } else if ((x == 0 && y > 0) || (x == 0 && y < 0)) {
            System.out.println("Eixo Y");
        } else if ((x > 0 && y == 0) || (x < 0 && y == 0)) {
            System.out.println("Eixo X");
        } else if ((x < 0 && y < 0)) {
            System.out.println("Q3");
        } else if ((x > 0 && y > 0)) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
    }
}
