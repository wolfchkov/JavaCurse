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
public class Anonymyous {

        private String[] strings = {
                "some",
                "world",
                "java",
                "best",
                "perfomance",
                "crossplatform"
        };

        public interface StringHandler {

                public String handle(String str);

        }

        public void arrayHandler(StringHandler handler) {

                for (String str : strings) {
                        String handledString = handler.handle(str);
                        System.out.printf("Basic string '%s', handled string '%s'. %n", str, handledString);
                }

        }

        public static void main(String[] args) {
                Anonymyous anonymyous = new Anonymyous();
                anonymyous.arrayHandler(new StringHandler() {
                        @Override
                        public String handle(String str) {
                                return str.substring(3);
                        }
                });
                
        }

}
