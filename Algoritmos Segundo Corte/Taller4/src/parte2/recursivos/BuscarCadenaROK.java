/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2.recursivos;

import java.util.Scanner;

/**
 *
 * @author juan3
 */
public class BuscarCadenaROK {

//    public static void main(String[] args) {
//        Scanner lc = new Scanner(System.in);
//        int n = lc.nextInt();
//        String[][] mat = new String[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                mat[i][j] = lc.next();
//            }
//        }
//        System.out.println("Item to be found?");
//        String item = lc.next();
//        System.out.println("Item " + item + " is in position " + hallarElemento(mat, item, 0, 0));
//    }
//
//    private static String hallarElemento(String[][] mat, String item, int i, int j) {
//        System.out.println(mat[i][j]);
//        String i0 = "";
//        String j0 = "";
//        if (i != mat.length - 1 || j != mat[i].length - 1) {
//            if (mat[i][j].equals(item)) {
//                i0 = String.valueOf(i);
//                j0 = String.valueOf(j);
//                return String.valueOf(i)+ ","+ String.valueOf(j);
//            } else {
//                if (j == mat[i].length - 1) {
//                    i++;
//                    j = 0;
//                } else {
//                    j++;
//                }
//                hallarElemento(mat, item, i, j);
//            }
//
//        }
//        return hallarElemento(mat,item,i,j);
//    }
}
