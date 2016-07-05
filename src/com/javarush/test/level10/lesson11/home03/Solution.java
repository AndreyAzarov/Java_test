package com.javarush.test.level10.lesson11.home03;

/* Правильный ответ: d=1.0
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=1.0.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b/c/e;/*вот здесь ставим byte т.к. диапазон -128 .. 127 т.е. остальное отбрасывается
        Так как тип byte предполагает 256 возможных значений, то полученное значение будет равно 257-256, то есть 1.
        double d = 1 + 0 (b/c/e  b/c = 1.3333 = 1; 1/e = 0/5 = 0 т.к. b c e остались тип int*/

        System.out.println(d);
    }
}

/*long l = 214748364;
        int i = (int) l;
        System.out.println(i);*/

///////////////////
/*public class Solution
{
    public static void main(String[] args)
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/e;

        System.out.println(d);
    }
}
*/