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
public class FCTRL2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int i = 1;
            while(n>0){
                i = i*n;
                n--;
            }
            System.out.println(""+i);
            t--;
        }
    }
}
