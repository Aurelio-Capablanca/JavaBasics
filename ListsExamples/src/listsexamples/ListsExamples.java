/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listsexamples;

import java.util.ArrayList;

/**
 *
 * @author Lab-11
 */
public class ListsExamples {

    /**
     * @param args the command line arguments
     */
    void heap(ArrayList<Integer> sol, int n, int i) {
        int large = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && sol.get(left) > sol.get(large))
            large = left;

        if (right < n && sol.get(right) > sol.get(large))
            large = right;

        if (large != i) {
            int temp = sol.get(i);
            sol.set(i, sol.get(large));
            sol.set(large, temp);
            heap(sol, n, large);
        }
    }

    void heapSort(ArrayList<Integer> sol, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(sol, n, i);

        for (int i = n - 1; i >= 0; i--) {
            //System.out.println(i);
            int temp = sol.get(0);
            sol.set(0, sol.get(i));
            sol.set(i, temp);
            heap(sol, i, 0);
        }
    }

    void printing(ArrayList<Integer> sol, int n) {
        for (int i = 0; i < n; ++i)
            System.out.println(sol.get(i) + " ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(0);
        arr.add(980);
        arr.add(6);
        arr.add(65);
        arr.add(233000);
        arr.add(4);
        arr.add(13);
        arr.add(37);
        arr.add(343);
        arr.add(100003);
        System.out.println(arr.toString());

        // Typical Heap Sort
        ListsExamples ex = new ListsExamples();
        int length = arr.size();
        ex.heapSort(arr, length);
        ex.printing(arr, length);
        // Typical Heap Sort

        // arr.sort((c,f)->c.compareTo(f));
        // System.out.println(arr.toString());
    }

}
