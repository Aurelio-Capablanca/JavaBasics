/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multidimensionalarrays;

import com.mycompany.multidimensionalarrays.controller.containerController;

/**
 *
 * @author LAB
 */
public class MultidimensionalArrays {

    public static void main(String[] args) {
        containerController conController = new containerController();
        
        conController.autoAdd();
        conController.printArr();
        conController.sumDiagonals(false);
        conController.sumDiagonals(true);
        conController.sumRowArrays(1, true);
        conController.sumRowArrays(3, false);
    }
}
