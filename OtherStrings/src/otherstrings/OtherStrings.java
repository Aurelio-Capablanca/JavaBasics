

/*
         e
 */


package otherstrings;

import java.util.Scanner;

/**
 *
 * @author e
 */
public class OtherStrings {

    /**
     *       --    e
     * @param args
     */
    public static void main(String[] args) {
        var data = new String("String is a Object of an array of bytes(Charactes) in Java");
        var dataNonSpecified = 34;
        System.out.println(data + " --  " + data.length());
        Scanner scan = new Scanner(String.valueOf(dataNonSpecified));
        System.out.println(scan.hasNextInt());
        System.out.println(dataNonSpecified + 3);
        System.out.println();
 
        var dataoftrics = new String("334 jlkh 64 35 l jklj 77 kljj 09 kjh 512 jkl 34 lh 3 lhjk 34 jkl 34 h 13 k 4 lk 3 h 42 35 34 lhk 3l 37 hlhlk 33 hkl");
        int sumsOfAll = 0;
        for (int i = 0; i < dataoftrics.length(); i++) {
            Scanner scans = new Scanner(String.valueOf(dataoftrics.charAt(i)));
            if (scans.hasNextInt()) {
                sumsOfAll += Integer.valueOf(dataoftrics.charAt(i))  ;
                System.out.print(dataoftrics.charAt(i));                
            }            
        }        
        System.out.println();
        System.out.println("Total : "+sumsOfAll);
        
        String nombre = "XD";
        char[] nombres = {'X','D'};        
        String dataRan = "";
        for (int i = 0; i < nombres.length; i++) {
            dataRan += nombres[i];
        }
        System.out.println("First: "+nombre);
        System.out.println("Second: "+dataRan);

    }

}