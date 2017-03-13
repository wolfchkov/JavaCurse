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
                Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите серию паспорта: ");
                while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        if (pattern.matcher(line).matches()) {
                                System.out.println("Серия паспорта введена правильно! ");
                                return;
                        } else {                            
                            System.out.println("Серия паспорта введена неверно! ");
                            System.out.print("Введите серию паспорта: ");                            
                        }
                }
        }

        static void matchGroups() {
                String stringToSearch = "Жили были дед да баба да внученька Маша. Не было у них ни коровки ни свинки никакой скотинки ...";

                Pattern p = Pattern.compile(" (\\S+аб\\S+) .* (\\S+оро\\S+).*");
                Matcher m = p.matcher(stringToSearch);

                if (m.find()) {
                    System.out.println("Надйенно групп " + m.groupCount());
                    for(int i = 0; i < m.groupCount(); ++i) {
                        String group = m.group(i);
                        System.out.format("'%s' %n",group); 
                    }

                }

        }

        public static void main(String[] args) {
            String name = "435345345";
                    
            int maxLength = name.length() + 4;
                    
            for(int i = 0; i < maxLength; i++) {
                System.out.print("*");
            }
            matchGroups();
            System.out.println();
            System.out.print("* ");
            System.out.print(name);
            System.out.println(" *");
            for(int i = 0; i < maxLength; i++) {
                System.out.print("*");
            }
            matchGroups();
            
            
        }
}
