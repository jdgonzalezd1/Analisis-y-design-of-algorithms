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
public class CombustibleGastado {
     public static void main(String[] args) {
        double auto = 12 ,litros, tiempo, velocidad;
        Scanner lc = new Scanner(System.in);
        
        tiempo = lc.nextInt();
        velocidad = lc.nextInt();
        
        litros = (tiempo * velocidad)/auto;
        
        System.out.printf("Valor: %.3f", litros);
        System.out.println();
    }   

}
