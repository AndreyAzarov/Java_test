package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);//здесь меняем все на FileInputStream
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(destinationFileName);//здесь наоборот на FileOutputStream


            int count = 0;
            while (fileInputStream.available() > 0)// здесь сразу шла ";"точка с запятой т.е. посути цикл бесконечный если файл
            //не пустой а с данными поэтому ее нужно удалить чтобы выполнился ниже блок кода
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                count++;

            }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
///////////////////////////////////////////////////////////////
/*public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = new java.io.FileOutputStream(destinationFileName);
        java.io.FileInputStream fileOutputStream = new java.io.FileOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available()>0);
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
*/