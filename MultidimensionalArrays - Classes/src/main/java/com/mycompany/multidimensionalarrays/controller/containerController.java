/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multidimensionalarrays.controller;

import com.mycompany.multidimensionalarrays.helpers.helper;
import com.mycompany.multidimensionalarrays.model.container;
import java.util.Arrays;

/**
 *
 * @author LAB
 */
public class containerController extends helper {

    container contain = new container();

    public void autoAdd() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < contain.getArrNumerics().length; i++) {
            for (int j = 0; j < contain.getArrNumerics()[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * (100 - 1)) + 1);
                contain.setArrNumerics(arr);
            }
        }
    }

    public void printArr() {
        for (int[] i : contain.getArrNumerics()) {
            this.printRows(i);
        }
    }

    public void sumDiagonals(boolean reverse) {
        int[][] temps = contain.getArrNumerics().clone();
        int sums = 0;
        for (int i = 0; i < contain.getArrNumerics().length; i++) {
            for (int j = 0; j < contain.getArrNumerics()[i].length; j++) {
                if (!reverse) {
                    if (i == j) {
                        //SUM CALL
                        sums += temps[i][j];
                        System.out.println("Principal: Step " + (i + 1) + " :" + sums);
                    }
                } else {
                    if (i + j == contain.getArrNumerics()[i].length - 1) {
                        //SUM CALL                
                        sums += temps[i][j];
                        System.out.println("Inverse: Step " + (i + 1) + " :" + sums);
                    }
                }
            }
        }
        if (!reverse) {
            System.out.println("Result Principal: " + sums);
        } else {
            System.out.println("Result Inverse: " + sums);
        }
    }

    public void sumRowArrays(int index, boolean isRow) {
        int sum = 0;
        int[][] arr = contain.getArrNumerics().clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isRow) {                    
                    if (index - arr.length == 1) {
                        index--;
                    } else {
                        System.out.println("Value Greater than the existing rows");
                        return;
                    }
                    if (j == index) {
                        sum += arr[i][j];
                        System.out.println("Sum Row Result : " + sum);
                    }
                } else {
                    if (index - arr[i].length == 1) {
                        index--;
                    } else {
                        System.out.println("Value Greater than the existing Columns");
                        return;
                    }
                    if (i == index) {
                        sum += arr[i][j];
                        System.out.println("Sum Column Result : " + sum);
                    }
                }
            }
        }
    }

}
