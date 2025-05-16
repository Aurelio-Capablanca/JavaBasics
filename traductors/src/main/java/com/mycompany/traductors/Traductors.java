/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.traductors;

import java.util.ArrayList;
//https://stackoverflow.com/questions/8147284/how-to-use-google-translate-api-in-my-java-application
//https://code.google.com/archive/p/java-google-translate-text-to-speech/
/**
 *
 * @author LAB
 */
public class Traductors {

    public static void main(String[] args) {

        readFiles reader = new readFiles();
        String[] wordsBank = reader.leerGrafico().split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < wordsBank.length; i++) {
            words.add(wordsBank[i]);
            System.out.println("Index: " + (i + 1) + "   WORD: " + words.get(i));
        }
       

    }
}
