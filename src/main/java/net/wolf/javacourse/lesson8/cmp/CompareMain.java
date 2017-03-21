/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8.cmp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author andrey
 */
public class CompareMain {
    public static void main(String[] args) {
        System.out.println("Вариант сортировки через Comparator");
        List<Employee> listEmpl = new ArrayList<Employee>();
        listEmpl.add(new Employee("Василий", LocalDate.of(1965, 3, 23)));
        listEmpl.add(new Employee("Павел", LocalDate.of(1973, 11, 23)));
        listEmpl.add(new Employee("Андрей", LocalDate.of(1969, 1, 21)));
        listEmpl.add(new Employee("Андрей", LocalDate.of(1984, 6, 15)));
        listEmpl.add(new Employee("Петр", LocalDate.of(1991, 4, 17)));
        listEmpl.add(new Employee("Анжелика", LocalDate.of(1990, 7, 2)));
        
        // Сортировка с классом Comparator
        System.out.println(listEmpl);
        Collections.sort(listEmpl, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
            
        });
        System.out.println("После сортировки: " + listEmpl);
 
        System.out.println("Вариант сортировки через Comparable");
        List<EmployeeComparable> listEmplCmp = new ArrayList<>();
        listEmplCmp.add(new EmployeeComparable("Василий", LocalDate.of(1965, 3, 23)));
        listEmplCmp.add(new EmployeeComparable("Павел", LocalDate.of(1973, 11, 23)));
        listEmplCmp.add(new EmployeeComparable("Андрей", LocalDate.of(1969, 1, 21)));
        listEmplCmp.add(new EmployeeComparable("Андрей", LocalDate.of(1984, 6, 15)));
        listEmplCmp.add(new EmployeeComparable("Петр", LocalDate.of(1991, 4, 17)));
        listEmplCmp.add(new EmployeeComparable("Анжелика", LocalDate.of(1990, 7, 2)));
        // Сортировка через Comparable
        System.out.println(listEmplCmp);
        Collections.sort(listEmplCmp);
        System.out.println("После сортировки: " + listEmplCmp);
    }
}
