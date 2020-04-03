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
public class SalarioConBonus {

    public static void main(String[] args) {
        String nombre = "";
        double salario, venta;
        Scanner lc = new Scanner(System.in);
        nombre = lc.next();
        salario = lc.nextFloat();
        venta = lc.nextFloat();
        double total = venta * 0.15;
        total = total + salario;
        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println("");
    }

}
