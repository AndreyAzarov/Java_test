package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String firstName = bufferedReader.readLine();
        String secondName = bufferedReader.readLine();



        int a = firstName.length();//преобразовываем строку в число.
        int b = secondName.length();

        if (firstName.equals(secondName))
            System.out.println("Имена идентичны");
        else if (a == b)
            System.out.println("Длины имен равны");
            System.out.println(b);
    }
}
