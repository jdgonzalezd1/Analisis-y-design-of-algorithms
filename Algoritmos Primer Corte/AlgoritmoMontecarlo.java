/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author juan3
 */
public class AlgoritmoMontecarlo {

    public static void main(String[] args) {
        System.out.println("Tirada del primer jugador: ");
        int tiro1 = (int) Math.floor(Math.random() * 6 + 1);
        System.out.println("Tirada del segundo jugador: ");
        int tiro2 = (int) Math.floor(Math.random() * 6 + 1);
        if (tiro1 > tiro2) {
            System.out.println("El jugador uno empieza");
        } else if (tiro2 > tiro1) {
            System.out.println("El jugador dos empieza");
        } else {
            System.out.println("Vuelvan a tirar");
        }
    }

}
