package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class QuickSort {

    private static LinkedList<Integer> generated_suite;


    public QuickSort(int minimum_value, int maximum_value, int total_value_number){
        generated_suite = suite_generator(minimum_value,maximum_value,total_value_number);
    }
    /**
     * suite_generator permet de générer une suite aléatoire
     *
     * @param minimum_value
     * @param maximum_value
     * @param total_value_number
     * @return suite trié
     */
    public LinkedList<Integer> suite_generator(int minimum_value, int maximum_value, int total_value_number) {
        LinkedList<Integer> suite = new LinkedList<>();
        Random rand = new Random();
        int value_generated;
        for (int i = 0; i < total_value_number; i++) {
            value_generated = minimum_value + rand.nextInt(maximum_value - minimum_value);
            suite.add(value_generated);
        }
        return suite;
    }

    /**
     *
     * @param array
     * @param indexfirstElement
     * @param indexlastElemnt
     */
    public static void quickSortApplication(ArrayList<Integer> array,int indexfirstElement, int indexlastElemnt){
        if(indexfirstElement < indexlastElemnt) {
            int pivot = array.get(0);
            int pivotPosition = partition(array,indexfirstElement,indexlastElemnt,pivot);
            quickSortApplication(array,indexfirstElement,pivotPosition - 1);
            quickSortApplication(array,pivotPosition + 1 ,indexlastElemnt);

        }
    }

    /**
     * Partition de partionner les éléments dans un tableau avec la partition de type drapeau
     * @param array
     * @param indexFirstElemnt
     * @param indexLastElemnt
     * @param pivot
     * @return
     */
    public static int partition(ArrayList<Integer> array, int indexFirstElemnt, int indexLastElemnt,int pivot){
        int i = 0;
        int j = 0;
        int k = indexLastElemnt;
        while (i<=k) {
            if (array.get(i) == pivot) {
                i += 1;
            }
            if (array.get(i) > pivot) {
                swap(array, i, k);
                k -= 1;
            }
            if (array.get(i) < pivot) {
                swap(array, i, j);
                j += 1;
                i += 1;
            }
        }
        return j;
    }

    /**
     * swap permet de permet permuter la position de deux élément dans une liste
     * @param suite
     * @param i
     * @param j
     */
    public static   void swap(ArrayList<Integer> suite, int i, int j){
        int temp = suite.get(i);
        suite.set(i,suite.get(j));
        suite.set(j,temp);
    }



}
