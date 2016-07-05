package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> listTemp1 = new ArrayList<String>();
        listTemp1.add("awedrft");
        listTemp1.add("awedrft");
        listTemp1.add("awedrft");
        listTemp1.add("awedrft");
        ArrayList<String> listTemp2 = new ArrayList<String>();
        listTemp2.add("cvbnm,");
        listTemp2.add("cvbnm,");

        ArrayList<String> listTemp3 = new ArrayList<String>();
        listTemp3.add("poiuy");
        listTemp3.add("poiuy");
        listTemp3.add("poiuy");
        ArrayList<String> listTemp4 = new ArrayList<String>();
        listTemp4.add("cvbnm");
        listTemp4.add("cvbnm");
        listTemp4.add("cvbnm");

        ArrayList<String>[] list = new ArrayList[4];
        list[0] = listTemp1;
        list[1] = listTemp2;
        list[2] = listTemp3;
        list[3] = listTemp4;

        //напишите тут ваш код

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}