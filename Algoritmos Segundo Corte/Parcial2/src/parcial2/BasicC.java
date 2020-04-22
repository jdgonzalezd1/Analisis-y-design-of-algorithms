/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author juan3
 */
public class BasicC {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int casos = lc.nextInt(), kilo = 0, cobertura = 0;
        for (int i = 0; i < casos; i++) {
            kilo = lc.nextInt();
            cobertura = lc.nextInt();
            if (kilo <= 0) {
                System.out.println("0");
            } else if(kilo<cobertura){
                System.out.println("1");
            }else{
                System.out.println(Math.round((double)kilo/cobertura));
            }
            
        }
    }
}
