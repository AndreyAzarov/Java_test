package com.javarush.test.level06.lesson08.task04;

//import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.io.*;


/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        return  s;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        return  number;
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double doubl = Double.parseDouble(bufferedReader.readLine());
        return doubl;
        //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = Boolean.parseBoolean(bufferedReader.readLine());
        return bool;
        //напишите тут ваш код

    }
}
