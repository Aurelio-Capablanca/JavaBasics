/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multidimensionalarrays;
/**
 *
 * @author LAB
 */
public class MultiDimensionalArrays {

    public static void printRows(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static int sumArrays(int[][] arr, int index) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == index) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] tables = new int[5][4];
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables[i].length; j++) {
                int value = 0;
                if (j == 0 && i != 4) {
                    value += (i + 1);
                    tables[i][j] = value;
                }
                if (j == 0 && i == 4) {
                    tables[i][j] = sumArrays(tables, 0);
                }
                if (j == 1 && i != 4) {
                    value += (i + 2);
                    tables[i][j] = value;
                }
                if (j == 1 && i == 4) {
                    tables[i][j] = sumArrays(tables, 1);
                }
                if (j == 2 && i != 4) {
                    value += (i + 3);
                    tables[i][j] = value;
                }
                if (j == 2 && i == 4) {
                    tables[i][j] = sumArrays(tables, 2);
                }
                if (j == 3 && i != 4) {
                    value += (i + 4);
                    tables[i][j] = value;
                }
                if (j == 3 && i == 4) {
                    tables[i][j] = sumArrays(tables, 3);
                }
            }
        }

        for (int[] i : tables) {
            printRows(i);
        }
    }

}