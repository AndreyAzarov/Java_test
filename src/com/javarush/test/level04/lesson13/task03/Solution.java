package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine(); //читаем строку с клавиатуры

        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);
*/
        for (int i=0; i<10; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
