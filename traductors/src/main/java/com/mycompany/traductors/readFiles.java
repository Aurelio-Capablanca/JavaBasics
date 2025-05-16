/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traductors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LAB
 */
public class readFiles {
     
    public String leerGrafico() {

        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        try {
            String path = j.getSelectedFile().getAbsolutePath();
            String lectura = "";
            f = new File(path);
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                while ((aux = br.readLine()) != null) {
                    lectura = lectura + aux + "\n";
                }
            } catch (IOException e) {
            }
            return lectura;
        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(j, "Sea cancelado el cargar archivo, saliendo...");
            System.exit(0);
        }
        return null;
    }
    
}
