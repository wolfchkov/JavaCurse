/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.inner;

/**
 * В вопросе "Вопрос" понятие "типа вопроса" (class Type) является очевидным. 
 * Альтернатива - создать класс верхнего уровня QuestionType, - будет менее выразительной, 
 * по крайней мере в контексте класса Question.
 * @author Andrey
 */
public class Question {

        private Type type;

        public Question(Type type) {
                this.type = type;
        }

        public Type getType() {
                return type;
        }

        public void setType(Type type) {
                this.type = type;
        }

        static enum Type {
                SINGLE_CHOICE, MULIT_CHOICE, TEXT
        }
        
        public static void main(String[] args) {
                 Question question = new Question(Type.TEXT);
                 
                if (question.getType() == Question.Type.TEXT) { 
                        System.out.println("Вопрос требующий ответа в виде текста!");
                }
        }
}
