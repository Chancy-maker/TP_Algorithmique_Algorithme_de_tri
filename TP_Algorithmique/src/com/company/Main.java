package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


import static com.company.BubbleSort.bubbleSortApplication;
import static com.company.BubbleSort.suite_generator;
import static com.company.MergeSort.decomposition;
import static com.company.MergeSort.mergeSortApplication;
import static com.company.QuickSort.*;


public class Main {

    public static void main(String[] args) {

        //BubbleSort b = new BubbleSort(0,10,20);
        //b.print();
        //bubbleSortApplication(b.getGenerated_suite());
        //b.print();

        //MergeSort m = new MergeSort(0,15,15);
        //m.print();
        //LinkedList<Integer> m1 = mergeSortApplication(m.getGeneratedSuite());
        //System.out.println(m1);






        QuickSort q = new QuickSort(0,10,10);
        q.print();
        quickSortApplication(q.getGenerated_suite(),0,q.getGenerated_suite().size()-1);
        q.print();


    }
}
