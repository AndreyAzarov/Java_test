package com.javarush.test.level15.lesson09.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Статики 2
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
*/

public class Solution {

    public static int A;
    public static int B;

    /* Если для инициализации переменных объекта нужно выполнить сложный код (например, что-то загрузить из файла),
    мы можем сделать это в конструкторе. Статические переменные такой возможности лишены.
    Но т.к. потребность в этом осталась, в классы можно добавить статический блок или блоки,
    которые по сути своей эквивалентны вызову статических конструкторов.*/

    static
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // дальше идет инициализации переменных
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());

            reader.close();
        }
        catch (IOException e)
        {
        }
    }

    public static final int MIN = min(A, B);// статикам мы можем присвоить только статики а вот нестатикам можем присваивать
    //не только нестатики но и статики

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
