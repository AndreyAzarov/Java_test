package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int count = 0;
        for (int i=0; i<3; i++)
        {
            String a = bufferedReader.readLine();
            int aNumber = Integer.parseInt(a);
            if (aNumber > 0)
                count += 1;
        }
        System.out.println(count);
    }
}
