/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.state.problem;

/**
 *
 * @author Andrey
 */
public enum GumballMachineEnum {
        /**
         * Все распроданно
         */
        SOLD_OUT,
        /**
         * Нет четвертака
         */
        NO_QUARTER,
        /**
         * Есть четвертак
         */
        HAS_QUARTER,
        /**
         * Продано
         */
        SOLD;
}
