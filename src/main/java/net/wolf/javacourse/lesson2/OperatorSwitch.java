/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson2;

/**
 *
 * @author Andrey
 */
public class OperatorSwitch {

    public static void switch1() {
        /**
         * Оператор выбора
         */
        int b = 3;

        switch (b) {
            case 1:
                System.err.println("1");
            case 2:
                System.err.println("2");
            case 3:
                System.err.println("3");
            case 4:
                System.err.println("4");
            case 5:
                System.err.println("5");
            case 6:
                System.err.println("6");
        }

    }

    public static void switch2() {

        // Числовое представление месяца
        int month = 8;

        String monthString;

        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Мрат";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентабрь";
                break;
            case 10:
                monthString = "Октабрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "Неверный месяц";
                break;
        }

        System.out.println(monthString);
    }

    public static void switch3() {
        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                //только в высокосные года 29 дней в феврале
                if (    (   (year % 4 == 0) && !(year % 100 == 0))
                            || (year % 400 == 0) ) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Неверный месяц.");
                break;
        }
        System.out.println("Количествой дней в месяце = "
                + numDays);
    }
    
    public static void switch4() {
        String month = "МАЙ";
        int monthNumber = 0;

        switch (month.toLowerCase()) {
            case "январь":
                monthNumber = 1;
                break;
            case "февраль":
                monthNumber = 2;
                break;
            case "март":
                monthNumber = 3;
                break;
            case "апрель":
                monthNumber = 4;
                break;
            case "май":
                monthNumber = 5;
                break;
            case "июнь":
                monthNumber = 6;
                break;
            case "июль":
                monthNumber = 7;
                break;
            case "август":
                monthNumber = 8;
                break;
            case "сентябрь":
                monthNumber = 9;
                break;
            case "октябрь":
                monthNumber = 10;
                break;
            case "ноябрь":
                monthNumber = 11;
                break;
            case "декабрь":
                monthNumber = 12;
                break;
            default: 
                monthNumber = -10;
                break;
        }

         System.out.println("Номер месяца " + month + " = "
                + monthNumber);
    }    

    public static void main(String args[]) {
        switch4();
    }
}
