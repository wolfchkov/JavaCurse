/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8.cmp;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author andrey
 */
public class Employee {
    
    private final String name;
    private final LocalDate birthDate;

    public Employee(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.birthDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nСотрудник " + name + ", День рожденья " + birthDate;
    }
    
    
    
}
