package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        int aNumber = Integer.parseInt(a);
        int bNumber = Integer.parseInt(b);
        int cNumber = Integer.parseInt(c);


        if (aNumber == cNumber)
            System.out.println(2);
        if (aNumber == bNumber)
            System.out.println(3);
        if (bNumber == cNumber)
            System.out.println(1);
    }
}
