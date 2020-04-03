/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan3
 */
public class LuDiOh {
    private static int convertir(String a) {
        return Integer.parseInt(a);
    }

    private static String win(int marcus, int leonard) {
        if (marcus > leonard) {
            return "Marcos";
        }
        if (marcus < leonard) {
            return "Leonardo";
        }
        return "Empate";
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Digite Los valores: ");
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String n;
        String[] card0;
        String[] card1;
        int[][] marcos;
        int[][] leonardo;
        String[] carta2;
        String[] carta1;
        while ((n = br.readLine()) != null) {
            card0 = br.readLine().split(" ");
            marcos = new int[Integer.parseInt(n)][Integer.parseInt(card0[0])];
            leonardo = new int[Integer.parseInt(n)][Integer.parseInt(card0[1])];
            for (int i = 0; i < marcos[0].length; i++) {
                carta1 = br.readLine().split(" ");
                for (int j = 0; j < marcos.length; j++) {
                    marcos[j][i] = convertir(carta1[j]);
                }
            }
            for (int i = 0; i < leonardo[0].length; i++) {
                carta2 = br.readLine().split(" ");
                for (int j = 0; j < leonardo.length; j++) {
                    leonardo[j][i] = convertir(carta2[j]);
                }
            }
            card1 = br.readLine().split(" ");
            int a = convertir(card1[0]) - 1;
            int b = convertir(card1[1]) - 1;
            String atributoesc = br.readLine();
            int marcus = marcos[convertir(atributoesc) - 1][a];
            int leonard = leonardo[convertir(atributoesc) - 1][b];
            System.out.println(win(marcus, leonard));
            break;
        }
    }

}
