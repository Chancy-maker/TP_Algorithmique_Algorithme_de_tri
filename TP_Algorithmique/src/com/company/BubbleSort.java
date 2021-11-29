package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class BubbleSort {
    public ArrayList<Integer> getGenerated_suite() {
        return generated_suite;
    }

    private ArrayList<Integer> generated_suite;

    /**
     * Constructor
     * @param minimum_value
     * @param maximum_value
     * @param total_value_number
     */

    public  BubbleSort(int minimum_value, int maximum_value, int total_value_number){
        this.generated_suite = suite_generator(minimum_value,maximum_value,total_value_number);
    }


    /**
     * suite_generator permet de générer une suite aléatoire
     * @param minimum_value
     * @param maximum_value
     * @param total_value_number
     * @return suite trié
     */
    public static ArrayList<Integer> suite_generator(int minimum_value, int maximum_value, int total_value_number){
        ArrayList<Integer> suite = new ArrayList<>();
        Random rand = new Random();
        int value_generated;
        for(int i =0; i<total_value_number; i++){
            value_generated = minimum_value + rand.nextInt(maximum_value-minimum_value);
            suite.add(value_generated);
        }
        return suite;
    }

    private static int temp;

    /**
     * swap permet de permuter des valeurs entre deux tableau
     * @param suite
     * @param i
     * @param j
     */
    public static void swap(ArrayList<Integer> suite,int i, int j){
        temp = suite.get(i);
        suite.set(i, suite.get(j));
        suite.set(j, temp);
    }

    /**
     * bublleSortApplication permet d'appliqué le trie à bull à la liste d'entier générée
     */
    public static   void bubbleSortApplication(ArrayList<Integer> lista){
        for (int i = lista.size() - 1 ;i>=1 ; i--){
            for (int j = 0; j<= i-1; j++){
                if(lista.get(j) > lista.get(j + 1)){
                    swap(lista, j, j+1);
                }
            }
        }
    }


    /**
     * print permet d'affichier la liste d'entier trié
     */
    public void print(){
        System.out.println(generated_suite.toString());
    }

}
