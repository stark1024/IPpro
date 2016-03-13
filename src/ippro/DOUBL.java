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
public class DOUBL {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int n1 = n*2;
            int b = 0;
            int a = n1;
            while(a>0){
                if(n1%a==0 && a!=1 && a!=2 && a!=n1){
                    b = 1;
                }
                a--;
            }
            if(b==0){
                System.out.println("LUCKY NO.");
            } else
                System.out.println("SORRY");
            t--;
        }
    }
}
