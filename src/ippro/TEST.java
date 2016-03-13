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
public class TEST {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = 0;
        while(a!=42){
            a = Integer.parseInt(s.next());
            if(a==42){
               break;
            }
            System.out.println(""+a);
        }
    }
}

