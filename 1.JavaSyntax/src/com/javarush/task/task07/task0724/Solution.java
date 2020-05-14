package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Вася", true, 62,null,null);
        Human grandfather2 = new Human("Петя", true, 60,null,null);
        Human grandmother1 = new Human("Маша", false,57,null,null);
        Human grandmother2 = new Human("Ганна", false,56,null,null);
        Human father = new Human("Коля", true, 42, grandfather1,grandmother1);
        Human mother = new Human("Инна", false, 42, grandfather2,grandmother2);
        Human son1 = new Human("Миша", true,17,father,mother);
        Human son2 = new Human("Артем", true,16,father,mother);
        Human daughter = new Human("Оля", false,15,father,mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, Boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

    }
}