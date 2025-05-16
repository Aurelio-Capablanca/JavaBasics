/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class sample {

    private int a, b; // declaramos dos variables tipo entero
    Scanner scan = new Scanner(System.in);
    private List<Integer> numbers = new ArrayList();
    
    
    public sample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer number) {
        this.numbers.add(number);
    }
    
    public sample() {     
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void evaluate() {      
        if (this.getA() > this.getB()) {
            System.out.println(a + " es el numero mayor");
        } else {
            System.out.println(b + " es el numero mayor");
        }
    }

    
    public Integer maxOfList(){
      return Collections.max(numbers);
    }
}
