/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;


public class Assignment1 {

       public static void main(String[] args) {

        for (int x = 0; x <= 100; x++) { // keeps the code iterating till it gets to 100
            if (x % 2 == 0) { // if x remainder equals 0 then it outputs
                System.out.println("Number: " + x);
            }
        }
    }
}