package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String c = bufferedReader.readLine();
        String d = bufferedReader.readLine();

        int aSide = Integer.parseInt(a);//преобразовываем строку в число.
        int bSide = Integer.parseInt(b);//преобразовываем строку в число.
        int cSide = Integer.parseInt(c);//преобразовываем строку в число.
        int dSide = Integer.parseInt(d);//преобразовываем строку в число.
        int max = aSide;
        if (max < bSide)
            max = bSide;
        if (max < cSide)
            max = cSide;
        if (max < dSide)
            max = dSide;

        System.out.println(max);
    }
}
