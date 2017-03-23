/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9.interaction;

import java.math.BigDecimal;

/**
 *
 * @author Andrey
 */
public class Deadlock {

    public static class BankAccount {

        BigDecimal balance;
        int id;

        BankAccount(int id, BigDecimal balance) {
            this.id = id;
            this.balance = balance;
        }

        /**
         * Изымает деньги из счета
         *
         * @param amount
         */
        void withdraw(BigDecimal amount) {
            // Wait to simulate io like database access ...
            try {
                Thread.sleep(10l);
            } catch (InterruptedException e) {
            }
            balance.subtract(amount);
        }

        /**
         * Пополняет счет
         *
         * @param amount
         */
        void deposit(BigDecimal amount) {
            // Wait to simulate io like database access ...
            try {
                Thread.sleep(10l);
            } catch (InterruptedException e) {
            }
            balance.add(amount);
        }

        static void transfer(BankAccount from, BankAccount to, BigDecimal amount) {
            System.out.printf("Переведем %s кредитов с счета %d на счет %d.%n",
                    amount, from.id, to.id);
            synchronized (from) {
                from.withdraw(amount);
                synchronized (to) {
                    to.deposit(amount);
                }
            }
        }

    }

    public static void main(String[] args) {
        final Deadlock.BankAccount account1 = new Deadlock.BankAccount(1, new BigDecimal("100.50"));
        final Deadlock.BankAccount account2 = new Deadlock.BankAccount(2, new BigDecimal("256.10"));

        new Thread(() -> {
            Deadlock.BankAccount.transfer(account1, account2, new BigDecimal("10.00"));
        }).start();

        new Thread() {
            public void run() {
                Deadlock.BankAccount.transfer(account2, account1, new BigDecimal("15.00"));
            }
        }.start();
    }
}
