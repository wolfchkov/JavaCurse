/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8.cmp;

import java.time.LocalDate;

/**
 *
 * @author andrey
 */
public class EmployeeComparable extends Employee implements Comparable<EmployeeComparable>{

    public EmployeeComparable(String fio, LocalDate birthDate) {
        super(fio, birthDate);
    }

    /**
     * Метод для сравнения текущего "Сотрудника" с другим
     * @param e объект "Сотрудника" с которым сравниваем
     * @return 
     */
    @Override
    public int compareTo(EmployeeComparable e) {
        int cmp = this.getName().compareTo(e.getName());
        
        if (cmp == 0) {
            return getBirthDate().compareTo(e.getBirthDate());
        }
        return cmp;                
    }
    
}
