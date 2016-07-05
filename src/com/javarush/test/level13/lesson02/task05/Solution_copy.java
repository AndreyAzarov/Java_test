package com.javarush.test.level13.lesson02.task05;

/* 4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
Объявление интерфейсов не изменять.
*/

/*public class Solution_copy
{

    public static void main(String[] args) throws Exception
    {

        System.out.println(new Dream().toString());
        System.out.println(new Hobbie().toString());

    }

        interface Desire
        {
        }

        interface Dream
        {

        }

        class Hobbie implements Dream
        {
            int INDEX = 1;

            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}*/

////////////////////////////////
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