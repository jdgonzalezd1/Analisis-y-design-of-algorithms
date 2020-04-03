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
public class WebBrowser {

    public static void main(String[] args) {
        int a;
        String x, y, z[], w[];
        Scanner lc = new Scanner(System.in);
        a = lc.nextInt();
        z = new String[a];
        for (int i = 0; i < a; i++) {
            z[i] = lc.next();
        }
        a = lc.nextInt();
        w = new String[a];
        for (int i = 0; i < a; i++) {
            w[i] = lc.next();
        }
        for (int i = 0; i < w.length; i++) {
            int v = 0;
            int t = 0;
            for (int j = 0; j < z.length; j++) {
                if (z[j].contains(w[i])) {
                    v++;
                    if (t < z[j].length()) {
                        t = z[j].length();
                    }
                }
            }
            if (t == 0) {
                System.out.println("-1");
            } else {
                System.out.println(v + " " + t);
            }
        }

    }
}
