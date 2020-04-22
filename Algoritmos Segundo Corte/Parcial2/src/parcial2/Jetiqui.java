/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author juan3 Ejercicio 8
 */
public class Jetiqui {
    
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int casos = lc.nextInt();
        String primera, segunda, incognita;
        boolean flag = false;
        for (int i = 0; i < casos; i++) {
            primera = lc.next();
            segunda = lc.next();
            incognita = lc.next();
            if (primera.length() == segunda.length()
                    && primera.length() == incognita.length()
                    && segunda.length() == incognita.length()) {
                for (int j = 0; j < primera.length(); j++) {
                    if ((incognita.charAt(j) == '_') && (primera.charAt(j) == segunda.charAt(j))) {
                        flag = false;
                        break;
                    }else{
                        flag = true;
                    }
                }
                if(flag){
                    System.out.println("Y");
                }else{
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        }
    }
}
