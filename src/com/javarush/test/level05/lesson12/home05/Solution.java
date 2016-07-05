package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;
        while (true)
        {
            String a = bufferedReader.readLine();
            if (a.equalsIgnoreCase("сумма"))
            {
                System.out.println(sum);
                break;
            }
            int aNumber = Integer.parseInt(a);
            sum += aNumber;

        }
        //напишите тут ваш код
    }
}
