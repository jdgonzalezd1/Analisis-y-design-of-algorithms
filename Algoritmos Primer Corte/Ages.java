/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juan3
 */
public class Ages {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double edad = 0, total = 0;
        List<Double> edades = new ArrayList<>();
        while (edad >= 0) {
            edad = l.nextInt();
            if (edad < 0) {
            } else {
                edades.add(edad);
            }
        }
        for (int i = 0; i < edades.size(); i++) {
            total = total + edades.get(i);
        }
        total = total / edades.size();
        if (edades.isEmpty()) {
        } else {
            System.out.printf("%.2f", total);
        }
    }

}
