package com.javarush.test.level13.lesson02.task05;

/* 4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
Объявление интерфейсов не изменять.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        //System.out.println(new Hobbie().toString());
        System.out.println(Dream.HOBBIE.toString());//интерфейс объект не создает
        System.out.println(new Hobbie().toString());
        //System.out.println(new Hobbie().toString());

    }
    /*В интерфейсах может быть только объявления методов и переменные, но чаще в них объявляют константы.*/


        interface Desire
        {
        }

        interface Dream
        {
             Hobbie HOBBIE = new Hobbie();
        }

        static class Hobbie implements Dream, Desire //класс должен иметь модификатор статик т.к. мы не сможем
            //обратиться к статической перем. в интерфейсе Dream
        {
               static int INDEX = 1;//значения меняются т.к. это одна и таже переменная для всех объектов
               //int INDEX = 1;//значения не меняются т.к. мы обращаемся к копиям указанной переменной
            //переменная статическая, то есть имеем один экземпляр переменной для всех объектов этого класса

            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}

//////////////////
/*public class Solution
{

    public static void main(String[] args) throws Exception
    {

        System.out.println(new Dream().HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

        interface Desire
        {
        }

        interface Dream
        {
            private static Hobbie HOBBIE = new Hobbie();
        }

        class Hobbie extends Desire implements Dream
        {
            static int INDEX = 1;

            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}*/