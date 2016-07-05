package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

/*В этой задаче нужно четко следовать условию
*
* надо поменять в конструкторе папу и маму + добавить конструктор с именем, который я удалил ( думал ненадо )
* должно быть вместо Cat(String name, Cat mother, Cat father)
* Cat(String name, Cat father , Cat mother ) т.е именно в таком порядке
* также в объекты параметры передавать сначала папу(имя) а потом мама
* Cat(sonName, catFather, null); и Cat(daughterName, null, catMother); т.е. папа всегда перед мамой стоит
* А уже при выводе сначала мамы имя выводится а потом папы
* */

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, null);

            String motherName = reader.readLine();
            Cat catMother = new Cat(motherName, null, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, null);


        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, null, catMother);

        String grandSonName = reader.readLine();
        Cat grandSon = new Cat(grandSonName, catSon, catDaughter);

        String grandDaughterName = reader.readLine();
        Cat grandDaughter = new Cat(grandDaughterName, catSon, catDaughter);


        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
        System.out.println(grandSon);
        System.out.println(grandDaughter);

    }
    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name)
        {
            this.name = name;
        }
        Cat(String name, Cat father , Cat mother )
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
            ;
        }
        @Override
        public String toString()
        {

            if ((mother == null) && (father == null))
                return "Cat name is " + name + ", no mother, no father";
            else if ( mother == null)
                //return "Cat name is " + name + ", mother is " + father.name + ", no father ";
                return  "Cat name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                //return "Cat name is " + name + ", no mother, father is " + mother.name;
                return  "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
/////////////////////////////////////
/*
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString()
        {
            if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }

}
*/
