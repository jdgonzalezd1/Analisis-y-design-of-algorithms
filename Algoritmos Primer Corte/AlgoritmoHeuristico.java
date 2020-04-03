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
public class AlgoritmoHeuristico {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        List<Integer> primos = new ArrayList<>();
        int cont = 2, sec, num = 2, counter = 2;
        System.out.println("¿Cuál es el n número primo que desea encontrar?");
        sec = lc.nextInt();
        do{
          if(num == 2){
              primos.add(num);
              num++;
              cont++;
          }else if(num%2 != 0 && num <= 7){
              primos.add(num);
              num++;
              cont++;
          }else if(num%2 != 0){
              counter++;
              if(num%counter !=0){
                  primos.add(num);
                  num++;
                  cont++;
                  counter = 2;
              }else{
                  num++;
              }              
          }
        }while(cont < sec);
    }

}
