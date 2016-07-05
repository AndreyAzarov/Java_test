package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution_copy
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-' //This method Returns true if passed character is really a digit.
            {
                return false;
            }
        }
        return true;
    }
}
//////////////////////////////////////////
/*
* package com.tutorialspoint;

import java.lang.*;

public class CharacterDemo {

   public static void main(String[] args) {

      // create 2 char primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = '9';
      ch2 = 'V';

      // create 2 boolean primitives b1, b2
      boolean b1, b2;

      // assign isDigit results of ch1, ch2 to b1, b2
      b1 = Character.isDigit(ch1);
      b2 = Character.isDigit(ch2);

      String str1 = ch1 + " is a digit is " + b1;
      String str2 = ch2 + " is a digit is " + b2;

      // print b1, b2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}
*/