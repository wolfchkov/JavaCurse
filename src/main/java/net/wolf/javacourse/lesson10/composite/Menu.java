/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.composite;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Menu extends MenuComponent {

        private final ArrayList<MenuComponent> menuComponents = new ArrayList<>();
        private final String name;
        private final String description;

        public Menu(String name, String description) {
                this.name = name;
                this.description = description;
        }

        @Override
        public void add(MenuComponent menuComponent) {
                menuComponents.add(menuComponent);
        }

        @Override
        public void remove(MenuComponent menuComponent) {
                menuComponents.remove(menuComponent);
        }

        @Override
        public MenuComponent getChild(int i) {
                return (MenuComponent) menuComponents.get(i);
        }

        @Override
        public String getName() {
                return name;
        }

        @Override
        public String getDescription() {
                return description;
        }

        public void print() {
                System.out.print("\n" + getName());
                System.out.println(", " + getDescription());
                System.out.println("---------------------");

                Iterator<MenuComponent> iterator = menuComponents.iterator();
                while (iterator.hasNext()) {
                        MenuComponent menuComponent
                                = (MenuComponent) iterator.next();
                        menuComponent.print();
                }
        }
}
