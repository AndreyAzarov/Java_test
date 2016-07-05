package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
            //list.add(Integer.parseInt(reader.readLine()));
        }
        for(int i=array.length-1; i>=0; i--)
        {
            System.out.println(array[i]);
        }
        /*for (int i = 0; i < list.length; i++)
        {
            int j = list.length - i - 1;//прем для выведения массива в обратном порядке
            System.out.println( list[j] );
        }*/
        //напишите тут ваш код
    }
}
