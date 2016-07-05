package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.text.DateFormat;


public class Solution
{
            public static void main(String[] args)
    {
        Date dd = new Date();
        //DateFormat dd2 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD);//тоже форматирует но установленми шаблонами не через строку
        SimpleDateFormat formatNowdays = new SimpleDateFormat("dd MM yyyy");
        //SimpleDateFormat formatNowdays = new SimpleDateFormat();
        System.out.println(formatNowdays.format(dd));
        //System.out.println(dd2.format(dd));
        //напишите тут ваш код
    }
}
