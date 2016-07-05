package com.javarush.test.level10.lesson11.home01;

/* Правильный ответ: d=2.941
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=2.941.
Пример вывода: 2.9411764705882355
*/

/*Говорится о том что нужно сделать именно преобразование типа т.е. перед какойто переменной поставить (тип)
* и в выводе должно быть не три знака после запятой а все(максимальное количество
* )*/
public class Solution
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        double d = a / (double)b;
        System.out.println(d);
    }
}

//////////////////////////////////////
/*public class Solution
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        double d = a / (double)b;
        System.out.println(d);
    }
}*/