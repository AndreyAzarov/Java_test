package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int max =  -2147483648;
        if (maximum > 0)
        {
            for (int i = 0; i < maximum; i++)
            {
                //BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                //эта строка не нужна т.к. поток на прием уже открыт
                int number = Integer.parseInt(reader.readLine());
                if (max < number)
                    max = number;
            }
        }
        //напишите тут ваш код
        System.out.println(max);
    }
}
