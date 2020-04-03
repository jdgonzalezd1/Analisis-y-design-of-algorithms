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
public class Alumnos {

    public static void main(String[] args) {
        double not, prom = 0;
        List<Double> notas = new ArrayList<>();
        Scanner lc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            not = lc.nextDouble();
            notas.add(not);
        }
        for (int i = 0; i < notas.size(); i++) {
            prom = prom + notas.get(i);
        }
        prom = prom / notas.size();
        if (prom > 7.0) {
            System.out.println("Alumno aprobado");
        } else if (prom < 5.0) {
            System.out.println("Alumno reprobado\n");
        } else {
            System.out.printf("Media: %.1f ", prom);
            System.out.println("\nAlumno en examen");
            not = lc.nextDouble();
            System.out.printf("Nota de examen: %.1f ", not);
            prom = (prom + not) / 2;
            if (prom >= 5.0) {
                System.out.println("\nAlumno aprobado");
                System.out.printf("Media final: %.1f ", prom);
            } else {
                System.out.println("\nAlumno reprobado");
                System.out.printf("Media final: %.1f", prom);
            }
        }
    }

}
