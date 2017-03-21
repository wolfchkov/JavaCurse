/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9.interaction;

/**
 *
 * @author Andrey
 */
public class Deadlock {

        public static class BankAccount {

                double balance;
                int id;

                BankAccount(int id, double balance) {
                        this.id = id;
                        this.balance = balance;
                }

                /**
                 * Изымает деньги из счета
                 * @param amount 
                 */
                void withdraw(double amount) {
                        // Wait to simulate io like database access ...
                        try {
                                Thread.sleep(10l);
                        } catch (InterruptedException e) {
                        }
                        balance -= amount;
                }

                /**
                 * Пополняет счет
                 * @param amount 
                 */                
                void deposit(double amount) {
                        // Wait to simulate io like database access ...
                        try {
                                Thread.sleep(10l);
                        } catch (InterruptedException e) {
                        }
                        balance += amount;
                }

                static void transfer(BankAccount from, BankAccount to, double amount) {
                        System.out.printf("Переведем %f кредитов с счета %d на счет %d.%n",
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
                final Deadlock.BankAccount account1 = new Deadlock.BankAccount(1, 100d);
                final Deadlock.BankAccount account2 = new Deadlock.BankAccount(2, 100d);

                new Thread() {
                        public void run() {
                                Deadlock.BankAccount.transfer(account1, account2, 10d);
                        }
                }.start();

                new Thread() {
                        public void run() {
                                Deadlock.BankAccount.transfer(account2, account1, 10d);
                        }
                }.start();
        }
}
