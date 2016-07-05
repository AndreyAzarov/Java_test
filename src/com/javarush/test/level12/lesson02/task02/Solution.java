package com.javarush.test.level12.lesson02.task02;

/* Ничего не выводится на экран
Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выдавала на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow
    {
        public String getName()
        {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow
    {
        public String getName()
        {
            //return "Я - кит";
            return "";

        }

    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////

/*package com.javarush.test.level12.lesson02.task03;

/* Кот от кота, а собака от собаки
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/

/*public class Solution
{
    public static void main(String[] args)
    {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet
    {
        public Pet getChild()
        {
            return new Pet();
        }
    }

    public static class Cat extends Pet
    {
        /*public Cat getChild()
        {
            return new Cat();
        }*/

/*    }

    public static class Dog extends Pet
    {
        *//*public Dog getChild()
        {
            return new Dog();
        }*//*

    }
}*/

