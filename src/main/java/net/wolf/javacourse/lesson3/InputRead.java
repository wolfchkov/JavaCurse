/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson3;

import java.util.Scanner;

/**
 *
 * @author Andrey
 */
class InputRead {

    public static void main(String[] args) {
        System.out.println("Введите любую строку!");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

             if (line.trim().equalsIgnoreCase("exit")) {
                break;
            }

            System.out.printf("Вы ввели строку %s %n", line);
        }
    }
}
