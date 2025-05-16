/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concurrentproject;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author LAB
 */
public class ThreadManager {

    ExecutorService exec = Executors.newFixedThreadPool(10);

    public CompletableFuture<Void> acceptMessage(String submit) {
        return CompletableFuture.runAsync(() -> {
            System.out.println(submit);
        }, exec);
    }

}
