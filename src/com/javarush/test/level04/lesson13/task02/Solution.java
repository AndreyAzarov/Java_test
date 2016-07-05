package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine(); //читаем строку с клавиатуры

        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        for (int i=0; i<m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
