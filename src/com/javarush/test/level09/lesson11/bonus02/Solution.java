package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;
import java.nio.file.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
а уже потом считывать файл для записи.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        Path pathSource = Paths.get(sourceFileName);
        Path pathDestination  = Paths.get(destinationFileName);

        try
        {
            Files.copy(pathSource, pathDestination);
        }
        catch (IOException ex)
        {
            //ex.printStackTrace();
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
        }

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        //Files.copy(sourceFileName, destinationFileName, StandardCopyOption.REPLACE_EXISTING);
        /*try
        {
            Files.copy(sourceFileName, destinationFileName);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }*/

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}

/////////////////////////
/*public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
*/