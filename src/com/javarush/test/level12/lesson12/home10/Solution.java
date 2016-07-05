package com.javarush.test.level12.lesson12.home10;

/* Метод, который выводит на экран число 10
Добавь еще один метод, чтобы программа выводила на экран число 10.
Подсказка: используй перегрузку методов.
*/

/*при перегрузке заголовок метода должен В ТОЧНОСТИ СОВПАДАТЬ с таким же методом у класса-предка — название,
 возвращаемое значение и список параметров.

Разные типы возвращаемых значений в сигнатуре - это РАЗНЫЕ методы.
*/


public class Solution
{
    public static void main(String[] args)
    {
        Integer i = 5;
        int x = transformValue(i);
        System.out.println(x);

    }

    public static int transformValue(int i)
    {
        return i*i;
    }

    private static int transformValue(Integer i)
    {
        return i+i;
    }
}
/*
public static int transformValue

public static Integer transformValue

видите? Это разные сигнатуры. int - примитив, Integer - это класс Integer.
То, что в круглых скобках- это аргумент, он к сигнатуре отношения не имеет.*/
///////////////////////////////////////////////////////
/*Метод, который описан внутри некоторого класса, но вызывается без приложения к конкретному объекту этого класса, называется статическим.*/

/*public class Solution
{
    public static void main(String[] args)
    {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);

    }

    public static int transformValue(int i)
    {
        return i*i;
    }


}*/
/*Создание метода с тем же именем, но с другим набором параметров называется перегрузкой.
Какой из перегруженных методов должен выполняться при вызове, Java определяет на основе фактических параметров.*/