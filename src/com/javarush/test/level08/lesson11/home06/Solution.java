package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children1 = new ArrayList<Human>();
        ArrayList<Human> children2 = new ArrayList<Human>();
        //ArrayList<Human> children3 = new ArrayList<Human>();

        Human grandFather1 = new Human("ded1",true,300, children2);
        Human grandFather2 = new Human("ded1",true,300, children2);
        Human grandMather1 = new Human("bab1",false,300, children2);
        Human grandMather2 = new Human("bab1",false,300, children2);
        Human dad = new Human("pap",true,30, children1);
        Human mam = new Human("mam",true,30, children1);

/*можно передать в объекты детей массив тотже что и родителям но при вызове объектов обнулить его т.е. удалить объекты из него*/
        Human son1 = new Human("bob",true,3,children1);
        Human son2 = new Human("den",true,3,children1);
        Human doughter = new Human("liza",false,3,children1);

/*либо создать третий массив но не инициализировать его объектами т.е. оставить пустым*/
        /*Human son1 = new Human("bob",true,3,children3);
        Human son2 = new Human("den",true,3,children3);
        Human doughter = new Human("liza",false,3,children3);*/
        /*Human son1 = new Human("bob");
        Human son2 = new Human("den");
        Human doughter = new Human("liza");*/

        children1.add(son1);
        children1.add(son2);
        children1.add(doughter);
        //children1.clear();
        children2.add(dad);
        children2.add(mam);

        System.out.println(dad);
        System.out.println(mam);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMather1);
        System.out.println(grandMather2);

        children1.clear();//обнуляем наш массив с объектами дети
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doughter);
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        Human(String name,boolean sex,int age, ArrayList<Human> children)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
