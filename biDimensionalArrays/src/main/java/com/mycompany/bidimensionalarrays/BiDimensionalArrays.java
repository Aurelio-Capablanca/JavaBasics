/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bidimensionalarrays;

import java.util.Arrays;

/**
 *
 * @author LAB
 */
public class BiDimensionalArrays {

    public static void printRows(String[] arr) {
        for (String a : arr) {
            System.out.print(a);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[][] arr = new String[4][4];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                //if (i == j || i == 2 && j == 0 || i == 0 && j == 2) {
                System.out.print("(["+i+"]["+j+"])");
                if (i == j) {
                    arr[i][j] = "x";
                }
                if(i+j == arr[i].length - 1){
                    arr[i][j] = "y";
                }
                if (arr[i][j] == null){
                    arr[i][j] =  "NaN";
                }
                //System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));
        
        for (String[] i : arr) {
            printRows(i);
        }
    }
}
