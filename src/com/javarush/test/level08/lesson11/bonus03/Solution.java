package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];//массив строк
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }
    public static void sort(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (isGreaterThan(array[j], array[j + 1]))
                {
                    String temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

                // либо так
        /*        for(int j = 1; j < array.length; j++)
            {
                if (isGreaterThan(array[j-1], array[j]))
                {
                    String temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }*/
            }
            //напишите тут ваш код
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}

///////////////////////////////////////////
/* Сравнение с помощью метода compareTo

Метод compareTo сравнивает значения char также как и метод equals. Кроме того метод возвращает целое отрицательное число,
если первая строка предшествует второй. Он возвращает нулевое значение, если строки равны, и целое положительное число,
если первый сравниваемый объект следует за вторым. Метод compareTo скажет, что строка "cat" предшествует "hat".
Наиболее важным для понимания такого сравнения является то, что метод сравнивает сами числовые значения букв.
Он определяет, что числовое значение буквы 'c' в "cat" меньше чем 'h' в "hat". */

/*char alph[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'*/

/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}

*/