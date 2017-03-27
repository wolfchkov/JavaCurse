/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class Lambda {

        static void numbers() {
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

                for (int number : numbers) {
                        System.out.println(number);
                }

                //numbers.forEach((Integer value) -> System.out.println(value));
        }

        public int sumAll(List<Integer> numbers) {
                int total = 0;
                for (int number : numbers) {
                        total += number;
                }
                return total;
        }

        public static void main(String[] args) {

        }
}
