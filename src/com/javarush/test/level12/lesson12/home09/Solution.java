package com.javarush.test.level12.lesson12.home09;

/* Родитель класса CTO
Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.
*/

public class Solution
{

    public static void main(String[] args)
    {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman
    {
        public void workHard();
    }
    /*Если нельзя реализовать метод в классе СТО, а в интерфейсе компилятор не позволяет - вывод напрашивается один - еще один класс.
    Создаем свой любой статический класс имплиментирующий интерфейс, реализуем в нем метод интерфейса и наследем от него свой СТО.*/

    public static class CTO  extends MyClass
    {

    }
    public static class MyClass implements Businessman
    {
        public void workHard()
        {}
    }


}

//////////////////////////////////////////////////////////////
/*public class Solution
{

    public static void main(String[] args)
    {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman
    {
        public void workHard();
    }

    public static class CTO  extends MyClass
    {

    }
    public static class MyClass implements Businessman
    {
        public void workHard()
        {}
    }


}*/