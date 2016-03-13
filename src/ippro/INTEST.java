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
public class INTEST {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int i = 0;
        while(n>0){
            int a = s.nextInt();
            if(a%k==0){
                i++;
            }
            n--;
        }
        System.out.println(""+i);
    }
}
