package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        int aSide = Integer.parseInt(a);//преобразовываем строку в число.
        int bSide = Integer.parseInt(b);//преобразовываем строку в число.

        if (aSide < bSide)
            System.out.println(aSide);
        else
            System.out.println(bSide);
    }
}