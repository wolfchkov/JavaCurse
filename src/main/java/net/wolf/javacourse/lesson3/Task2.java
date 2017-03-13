/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson3;

import java.util.Scanner;
import net.wolf.javacourse.lesson4.Point2D;
import net.wolf.javacourse.lesson4.Point3D;

/**
 *
 * @author Admin
 */
public class Task2 {

    public static int getSelection(String str1, String str) {
        int selection = 0;

        if (str == null) {
            return selection;
        }

        switch (str.toLowerCase()) {

            case "a":
                String Upper = str1.toUpperCase();
                System.out.println(Upper);
                break;
            case "b":
                String Lower = str1.toLowerCase();
                System.out.println(Lower);
            break;
            case "c":
                String output = " ";//все слова с заглавной буквы.
                String[] words = str1.split(" ");
                for (String word : words) {
                    String first = word.substring(0, 1).toUpperCase();
                    String all = word.substring(1);
                    output += first + all;
                }
                System.out.println(output);
            break;
            case "d":
                StringBuilder y = new StringBuilder(str1);
                char f = y.charAt(0);
                String y1 = String.valueOf(f);
                String y2 = y1.toLowerCase();
                y.replace(0, 1, y2);
                System.out.println(y);
            break;
            case "e":
                StringBuilder s = new StringBuilder(str1);
                char f1 = s.charAt(0);
                String r = String.valueOf(f1);
                String r1 = r.toUpperCase();
                s.replace(0, 1, r1);
                System.out.println(s);
            break;
            case "f":
                System.out.println("Действий больше нет");
                break;

            default:
                System.out.println("ошибка");
                break;
        }
        return selection;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();

        System.out.println("Выбурите ваши действия");
        System.out.println("a = > СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
        System.out.println("b = > строка в нижнем регистре ");
        System.out.println("c = >С Заглавной Буквы Первый Символ Каждого Слова В Строке");
        System.out.println("d = > пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
        System.out.println("e = > Как в предложении(с заглавной буквы)");
        System.out.println("f = > не чего не изменять");

        String str = in.nextLine();
        int ret = getSelection(str1, str);

    }
}