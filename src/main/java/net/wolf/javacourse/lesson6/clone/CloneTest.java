/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.clone;

/**
 *
 * @author Andrey
 */
public class CloneTest {

        static class Person implements Cloneable {

                private String name;
                private int age;
                private Car car;

                Person(Car car, int age, String name) {
                        this.car = car;
                        this.age = age;
                        this.name = name;
                }

                public void setName(String name) {
                        this.name = name;
                }

                public void setAge(int age) {
                        this.age = age;
                }

                public void setCar(Car car) {
                        this.car = car;
                }

                public String getName() {
                        return name;
                }

                public int getAge() {
                        return age;
                }

                public Car getCar() {
                        return car;
                }

                @Override
                public String toString() {
                        return this.name + " {"
                                + "age=" + age
                                + ", car=" + car
                                + '}';
                }

        }

        static class Car  implements Cloneable {

                private final String color;

                Car(String color) {
                        this.color = color;
                }

                
                public String getColor() {
                        return color;
                }

                @Override
                public String toString() {
                        return "{"
                                + "color car='" + color + '\''
                                + '}';
                }
        }

        public static void main(String[] args) throws CloneNotSupportedException {
                Car car = new Car("Green");
                Person person = new Person(car, 25, "Mike");
//
//                //клонируем
//                Person clone = person.clone();                
//                System.out.println("Оригинал: "  + person);
//                System.out.println("Копия: "  + clone);
//                clone.setName("Ivan");
//               // car.setColor("red");
//                System.out.println("Оригинал: "  + person);
//                System.out.println("Копия: "  + clone);
        }
}
