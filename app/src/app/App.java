/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Universidad.Universidad;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Honorè Reille
 */
public class App {
    static String value;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompletableFuture<String> first = CompletableFuture.supplyAsync(() -> {
            Universidad.UniversidadNombre();
            System.out.println(Universidad.asignatura("Prgramaciòn Orientada a Objetos", "02"));
            Universidad universidad = new Universidad();
            System.out.println(universidad.nombres("Honorè Reille", "3543543543543"));
            universidad.notafinal(5.4, 4.4, 8);
            value = "first";
            return value;
        });
        System.out.println(first.isDone());
        first.thenApply((String __) -> {
            value = "SS";
            return value;
        }).join();
         
        try {
            System.out.println(first.get());
            System.out.println(first.get());
            System.out.println(first.isDone());
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
