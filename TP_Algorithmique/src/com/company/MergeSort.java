package com.company;


import java.util.LinkedList;
import java.util.Random;

public class MergeSort {

    /**
     *
     */
    private static LinkedList<Integer> generated_suite;




    /**
     * Constructor
     *
     * @param minimum_value
     * @param maximum_value
     * @param total_value_number
     */

    public MergeSort(int minimum_value, int maximum_value, int total_value_number) {
        this.generated_suite = suite_generator(minimum_value, maximum_value, total_value_number);
    }

    /**
     * Guetter de la variable generated_suite
     * @return
     */
    public LinkedList<Integer> getGeneratedSuite() {
        return generated_suite;
    }



    /**
     * suite_generator permet de générer une suite aléatoire
     *
     * @param minimum_value
     * @param maximum_value
     * @param total_value_number
     * @return suite trié
     */
    public  LinkedList<Integer> suite_generator(int minimum_value, int maximum_value, int total_value_number) {
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
     * decomposion permet de décomposer une liste chainé en deux liste
     *
     * @param list
     */
    public static LinkedList[] decomposition(LinkedList<Integer> list){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList[] tab = new LinkedList[2];
        int i = 0;
        while (!list.isEmpty()){
            if(i % 2 == 0){
                list1.add(list.poll());
            }else {
                list2.add(list.poll());
            }
            i++;
        }
        tab[0] = list1;
        tab[1] = list2;
        return tab;
    }

    /**
     * merger permet de fusion deux liste chaine trié
     * @param list1
     * @param list2
     */
    public static LinkedList<Integer> merger (LinkedList < Integer > list1, LinkedList < Integer > list2){
        LinkedList<Integer> finalList = new LinkedList<>();
        while (!list1.isEmpty() && !list2.isEmpty() ){
            if (list1.getFirst()<=list2.getFirst()){
                finalList.add(list1.poll());
            }
            else if (list1.getFirst() >= list2.getFirst()){
                finalList.add(list2.poll());
            }
        }
        finalList.addAll(list1);
        finalList.addAll(list2);
        return finalList;
    }
    /**
     * mergeSortApplication permet d'appliquer un trie par fusion à une suite d'éléments.
     * @param
     * @return
     */
    public static LinkedList<Integer> mergeSortApplication (LinkedList < Integer > lista) {
        if (lista.size() > 1) {
            LinkedList[] tab1 = decomposition(lista);
            tab1[0] = mergeSortApplication(tab1[0]);
            tab1[1] = mergeSortApplication(tab1[1]);
            lista = merger(tab1[0],tab1[1]);


        }

        return lista;
    }

    /**
     * print permet d'affichier la liste d'entier trié
     */
    public void print () {
        System.out.println(generated_suite.toString());
    }
}
