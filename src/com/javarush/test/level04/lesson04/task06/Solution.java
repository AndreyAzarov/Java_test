package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number = bufferedReader.readLine();
        int nDay = Integer.parseInt(number);//преобразовываем строку в число.


        if (nDay == 1)
        {
            System.out.println("понедельник");
        }
        if (nDay == 2)
        {
            System.out.println("вторник");
        }
        if (nDay == 3)
        {
            System.out.println("среда");
        }
        if (nDay == 4)
        {
            System.out.println("четверг");
        }
        if (nDay == 5)
        {
            System.out.println("пятница");
        }
        if (nDay == 6)
        {
            System.out.println("суббота");
        }
        if (nDay == 7)
        {
            System.out.println("воскресенье");
        }
        if (nDay > 7 || nDay < 1)
        {
            System.out.println("такого дня недели не существует");

        }

    }
}