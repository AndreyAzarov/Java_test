package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] string = s.toCharArray();

for (int i = 0; i < 40; i++)
{
    char[] temp = new char[string.length - i];
    for(int j = i, k = 0; j < string.length; j++, k++)
    {
        temp[k] = string[j];
    }
    System.out.println(temp);
}        //напишите тут ваш код
    }

}
//////////////////////////////////
/*public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

}        //напишите тут ваш код
    }

}
*/