package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++)
        {
            String number = reader.readLine();
            int a = Integer.parseInt(number);
            array[i] = a;
        }


        for (int i = 0; i < array.length; i++)
        {

            for (int j = 1; j < array.length; j++)
            {
                int temp;
                if (array[j-1] > array[j])
                {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        //напишите тут ваш код
    }
}

///////////////////////////////////////////
/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
    }
}
*/