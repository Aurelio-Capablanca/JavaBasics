/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriders;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class Overriders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1;
        int val2;
        testerClass tc;
        System.out.println("insert num 1: ");
        val1 = scan.nextInt();
        System.out.println("insert num 2: ");
        val2 = scan.nextInt();

        tc = new testerClass();
        tc.operacion(val1, val2);
        tc = new testerClass(val1, val2);
        System.out.println("SUM : " + tc.operacion());
    }

}
