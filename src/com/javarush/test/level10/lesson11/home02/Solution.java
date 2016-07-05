package com.javarush.test.level10.lesson11.home02;

/* Правильный ответ: d=5.5
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=5.5.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/(double)e;
        System.out.println(d);
    }
}
///////////////////////////
/*Деление происходит слева напрово. Если делить b/c получится 1.333333 т.е double но нам нужно только один знак
 * поэтому оставляем b и c integer т.е. будет 1 т.к. все знаки после запятой отбросятся. И теперь делим 1 на 2 получим
  * 0.5 но если оставить e integer то получим 0 о нам нужно 0.5 поэтому преобразуем в тип double*/
/*public class Solution
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/e;
        System.out.println(d);
    }
}*/