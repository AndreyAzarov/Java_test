package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);


        while (fileInputStream.available() > 0)
        {
            arrayList.add(fileInputStream.read());
        }

        for(Integer number: arrayList)
        {
            int[] array = new int[];
            if (number % 2== 0)
            {

            }
            }
           // System.out.println(number);
        }

        //fileInputStream.close();


        // напишите тут ваш код
    }
}
 */
