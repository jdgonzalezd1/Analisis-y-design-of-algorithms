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
public class Dijkstra {

    public static void main(String[] args) {
        List<String> jewel = new ArrayList<>();
        Scanner lc = new Scanner(System.in);
        String a;
        boolean flag = true;
        do {
            a = lc.next();
            if (a.contains("(") || a.contains(")")) {
                if (!jewel.isEmpty()) {
                    for (int i = 0; i < jewel.size(); i++) {
                        if (a.equals(jewel.get(i))) {
                            flag = true;
                            break;
                        }
                    }
                } else {
                    jewel.add(a);
                }
                if (!flag) {
                    jewel.add(a);
                }
            } else {
                break;
            }

            flag = false;
        } while (!a.contains("(") || !a.contains(")"));
        System.out.println(jewel.size());
    }

}
