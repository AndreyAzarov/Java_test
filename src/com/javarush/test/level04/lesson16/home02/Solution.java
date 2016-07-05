package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
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

        if ((cNumber <= aNumber && aNumber <= bNumber) || (cNumber > aNumber && aNumber > bNumber))
        {System.out.println(aNumber);}
        else if ((cNumber <= bNumber && bNumber <= aNumber) || (cNumber > bNumber && bNumber > aNumber))
        {System.out.println(bNumber);}
        else if ((bNumber <= cNumber && cNumber <= aNumber) || (bNumber > cNumber && cNumber > aNumber))
        {System.out.println(cNumber);}
        }

    }

