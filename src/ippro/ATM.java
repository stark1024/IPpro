/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ippro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ATM {
    public static void main(String args[]){
        int w;
        double b;
        Scanner s = new Scanner(System.in);
         w = s.nextInt();
         b = s.nextDouble();
         if(w<=b){
             if(w%5==0){
                 b = b-w-0.5;
             } else
                 b = b;
             
             System.out.println(""+b);
         } else
             System.out.print("Invalid");
    }
}
