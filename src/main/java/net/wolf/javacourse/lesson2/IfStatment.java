/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author wolf
 */
public class IfStatment {
    
    
    /**
     * Преобразует баллы по тесту в оценку успеваемости
     * @param score баллы по тесту
     * @return 
     */
    static int testScoreToMark(int score) {
        
        if (score >= 90) {
            return 5;
        } else if (score >= 70) {
            return 4;
        } else if (score >= 60) {
            return 3;
        } else {
            return 2;
        }
    }
    
    /**
     * Бросаем кубик
     * @return 
     */
    static int rollTheDice() {
        int rand = ThreadLocalRandom.current().nextInt(100);
        
        if (rand >= 0 && rand < 40)  {
            return 1;
        }
        if (rand >= 40 && rand < 50)  {
            return 2;
        }
        if (rand >= 50 && rand < 60)  {
            return 3;
        }
        if (rand >= 60 && rand < 70)  {
            return 4;
        }
        if (rand >= 80 && rand < 90)  {
            return 5;
        }
        return 6;
    }
    
    public static void main(String args[]) {
        //Четное ли число?

    }
}
