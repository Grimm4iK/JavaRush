package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> value = cats.iterator();
        while (value.hasNext()) {
            Cat i = value.next();
            value.remove();
            break;
        }


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<Cat>();
        set.add(new Cat("Murzik",5));
        set.add(new Cat("Bobik", 7));
        set.add(new Cat("Tom", 9));
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat() {

        }

    }
}
