package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


import static com.company.BubbleSort.bubbleSortApplication;
import static com.company.BubbleSort.suite_generator;
import static com.company.MergeSort.decomposition;
import static com.company.MergeSort.mergeSortApplication;
import static com.company.QuickSort.quickSortApplication;


public class Main {

    public static void main(String[] args) {

        //BubbleSort b = new BubbleSort(0,10,20);
        //b.print();
        //bubbleSortApplication(b.getGenerated_suite());
        //b.print();

        MergeSort m = new MergeSort(0,15,15);
        m.print();
        LinkedList<Integer> m1 = mergeSortApplication(m.getGeneratedSuite());
        System.out.println(m1);





        //ArrayList<Integer> list = suite_generator(0,15, 10);
        //System.out.println(list);
        //quickSortApplication(list, 0 , list.size() - 1);
        //System.out.println(list);

    }
}
