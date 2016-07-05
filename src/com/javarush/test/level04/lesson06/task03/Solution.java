package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int aSide = Integer.parseInt(a);//преобразовываем строку в число.
        int bSide = Integer.parseInt(b);//преобразовываем строку в число.
        int cSide = Integer.parseInt(c);//преобразовываем строку в число.

            if (aSide <= bSide && aSide <= cSide)
            {
                if (bSide <= cSide)
                    System.out.println(cSide + " " + bSide + " " + aSide);
                else
                    System.out.println(bSide + " " + cSide + " " + aSide);
            }
            else if (cSide <= bSide && cSide <= aSide)
            {
                if (bSide <= aSide)
                    System.out.println(aSide + " " + bSide + " " + cSide);
                else
                    System.out.println(bSide + " " + aSide + " " + cSide);
            }
            else if (bSide <= aSide && bSide <= cSide)
            {
                if (aSide <= cSide)
                    System.out.println(cSide + " " + aSide + " " + bSide);
                else
                    System.out.println(aSide + " " + cSide + " " + bSide);
            }

        }
    }



