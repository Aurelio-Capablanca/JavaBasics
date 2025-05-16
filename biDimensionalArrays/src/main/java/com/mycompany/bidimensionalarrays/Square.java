/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bidimensionalarrays;

import static com.mycompany.bidimensionalarrays.BiDimensionalArrays.printRows;

/**
 *
 * @author LAB
 */
public class Square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] arr = new String[7][5];
        
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {                
                System.out.print("(["+i+"]["+j+"])");
                if ( (i == 0 && j > 0 && j < arr[i].length - 1) || ( i > 1 && j >0)  ) {
                    arr[i][j] = "x";
                }
                if (arr[i][j] == null){
                    arr[i][j] =  " - ";
                }
                //System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        for (String[] i : arr) {
            printRows(i);
        }
        
    }
    
}
