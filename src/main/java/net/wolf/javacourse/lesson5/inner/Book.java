/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.inner;

/**
 *
 * @author Andrey
 */
public class Book {

        private final String name;
        private final String author;
        private final int year;
        private final Publisher publisher;

        public Book(String name, String author, int year, String publ) {

                this.name = name;
                this.author = author;
                this.year = year;
                publisher = new Publisher(publ);
        }

        public String getName() {
                return name;
        }

        public String getAuthor() {
                return author;
        }

        public int getYear() {
                return year;
        }

        public Publisher getPublisher() {
                return publisher;
        }

        public class Publisher {

                public String name;
                public Book book;

                Publisher(String name) {
                        book = Book.this;
                        this.name = name;
                }

                public String getName() {
                        return name;
                }

                public Book getBook() {
                        return book;
                }
                
                public String getAuthor() {
                        return author;
                }

        }
        
        public static void main(String[] args) {
                 Book book = new Book("Меч Предназначения", "Анджей Сапковский", 1992, "АСТ, Полиграфиздат");
                 
        }
}
