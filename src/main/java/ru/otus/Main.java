package ru.otus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            list.add(i, (int) (Math.random() * 50000));
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            list1.add(i, (int) (Math.random() * 50000));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <50000; i++) {
            list2.add(i, (int) (Math.random() * 50000));
        }
        Java_sort(list);
        bubble_sort(list1);
      
        inserionSort(list2);
       


    }

    public static void Java_sort(List<Integer> list) {
        Date start = new Date();
        Collections.sort(list);
        Date end = new Date();
        System.out.println("Java Sort time: " + (end.getTime() - start.getTime()));
    }
    //Сортировка пузырьком
    public static void bubble_sort(List<Integer> list1) {
        long time = System.currentTimeMillis();
        for (int k = list1.size() - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (list1.get(i) > list1.get(i + 1)) {
                    int temp = list1.get(i);
                    list1.set(i, list1.get(i + 1));
                    list1.set(i + 1, temp);
                }
            }
        }
        System.out.println("Bubble time: " + (System.currentTimeMillis() - time));

    }
    //Сортировка вставками
    public static void inserionSort(List<Integer> list2) {
        long time = System.currentTimeMillis();
        for (int i = 1; i < list2.size(); i++) {
            int temp = list2.get(i);
            int j = i;
            while (j > 0 && list2.get(j - 1) > temp) {
                list2.set(j, list2.get(j - 1));
                j--;
            }
            list2.set(j, temp);
        }System.out.println("inserionSort time: " + (System.currentTimeMillis() - time));

    }
}
