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
public class SimpleFactorial {
    public static void main(String[] args) {      
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int m = 1;
        while(n!=0){
           m = m*n;
           n--;               
        }
        System.out.println(m); 
    }
}
