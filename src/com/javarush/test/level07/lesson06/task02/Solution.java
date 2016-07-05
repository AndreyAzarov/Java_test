package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> dual = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        for (int i = 0; i < 5; i++)
        {
            String string = reader.readLine();
            list.add(string);
        }

        int max = list.get(0).length();

        for (int i = 0; i < list.size() - 1; i++)
        {
            if (max < list.get(i+1).length())
            {
                max = list.get(i+1).length();
                index = i + 1;
            }
        }
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == list.get(index).length())
                dual.add(list.get(index));
        }
        for (int i = 0; i < dual.size(); i++)
        {
            System.out.println(dual.get(i));
        }
    }
}
