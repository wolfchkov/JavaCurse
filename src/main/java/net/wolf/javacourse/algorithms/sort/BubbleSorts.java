/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.algorithms.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Алгоритмы разновидностей пузырькововй сортировки
 *
 * @author andrey
 */
public final class BubbleSorts {

    private static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
        T temp = data[a];
        data[a]= data[b];
        data[b] = temp;
    }

    public static <T extends Comparable<T>> void foolishSort(T[] data) {
        boolean sorting = true;
        int size = data.length;
        while (sorting) {
            boolean hasSwap = false;
            for (int i = 1; i < size; ++i) {
                if (data[i - 1].compareTo(data[i]) > 0) {
                    swap(data, i - 1, i);
                    hasSwap = true;
                }
            }
            sorting = hasSwap;
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] data) {
        int size = data.length;
        for (int i = 0; i < size; ++i) {
            int mj = size - i - 1;
            for (int j = 0; j < mj; ++j) {
                if (data[j].compareTo(data[j+1]) > 0) {
                    swap(data, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int SIZE = 100_000_000;
        Integer[] data = new Integer[SIZE];
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < SIZE; ++i) {
            data[i] = rand.nextInt(1, 50_000);
        }
       
        long start = System.currentTimeMillis();
        //bubbleSort(data);
        Arrays.parallelSort(data);
        //Arrays.sort(data);
        //data = data.parallelStream().sorted().collect(Collectors.toList());
        long elapsed = System.currentTimeMillis() - start;
        
        System.out.println(elapsed);
    }
}
