package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
   /* инициализируем  переменные класса в статическом блоке. теперь при вызове этого класса (по необходимости)
   * будет выполнено присваивание значений всех его статических переменных и вызов всех статических блоков.
   * для этого в классы можно добавить статический блок или блоки, которые по сути своей эквивалентны
   * вызову статических конструкторов.*/
    static
    {
        labels.put(3.0, "3");
        labels.put((double)7, "7");
        labels.put(4.0, "4");
        labels.put(5.0, "5");
        labels.put((double) 6, "6");
    }

    public static void main(String[] args) {
            System.out.println(labels);
    }
}
