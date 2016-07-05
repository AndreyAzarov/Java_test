package com.javarush.test.level06.lesson05.task04;

/**
 * Created by edward on 03.04.16.
 */
/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat
{
    public static int catCount = 0;

    public Cat()
    {
        catCount += 1;
    }
    protected void finalize() throws Throwable
    {
        catCount -= 1;
    }//напишите тут ваш код

    public static void main(String[] args) {
    }
}
