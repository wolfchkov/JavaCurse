/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Andrey
 */
public class Patterns {

        static void pasportSeries() {
                Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{4}$");
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите серию паспорта: ");
                while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        if (pattern.matcher(line).matches()) {
                                System.out.print("Серия паспорта введена правильно! ");
                                return;
                        } else {
                                System.out.print("Серия паспорта введена неверно! ");
                        }
                }
        }

        static void matchGroups() {
                String stringToSearch = "Жили были дед да баба да внученька Маша. Не было у них ни коровки ни свинки никакой скотинки ...";

                Pattern p = Pattern.compile(" (\\S+аб\\S+) .* (\\S+оро\\S+).*");
                Matcher m = p.matcher(stringToSearch);

                if (m.find()) {
                        System.out.println("Надйенно групп " + m.groupCount());
                        String group1 = m.group(1);
                        String group2 = m.group(2);

                        System.out.format("'%s', '%s'\n", group1, group2);
                }

        }

        public static void main(String[] args) {
                matchGroups();
        }
}
