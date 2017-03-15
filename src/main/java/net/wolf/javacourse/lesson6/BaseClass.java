/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6;

/**
 *
 * @author Andrey
 */
public class BaseClass {

        public static void main(String[] args) {
                int size = 10;
                int[][] quad = new int[size][size];
                int num = 0;
                int maxn = size * size + 1; 
                int maxi = size  - 1;
                for (int i = 0; i < size; i++) {
                        int diag = i;
                        if ((i & 1) == 1) {
                                for (int j = 0; j <= i; j++, diag--) {
                                        quad[diag][j] = ++num;
                                        quad[maxi - diag][maxi - j] = (maxn - num);
                                }
                        } else {
                                for (int j = 0; j <= i; j++, diag--) {
                                        quad[j][diag] = ++num;
                                        quad[maxi - j][maxi - diag ] = (maxn - num);
                                }
                        }
                }

                for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                                System.out.printf("%4d ", quad[i][j]);
                        }
                        System.out.println();
                        System.out.println();
                        
                        
                }
                
                
        }
}

