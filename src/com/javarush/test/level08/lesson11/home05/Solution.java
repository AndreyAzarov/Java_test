package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chArray = s.toCharArray();
        chArray[0] = Character.toUpperCase(chArray[0]);

        for (int i = 0; i < chArray.length; i++)
        {
            if ( chArray[i] == ' ')
            {
                chArray[i + 1] = Character.toUpperCase(chArray[i + 1]);
            }
           //System.out.print(chArray[0]);
        }

        for (int i = 0; i < chArray.length; i++)
        {
            System.out.print(chArray[i]);
        }

        //напишите тут ваш код
    }


}
