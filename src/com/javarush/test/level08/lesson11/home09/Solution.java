package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

/*public class Solution
{
    public static void main(String[] args)
    {
        Date countDate = new Date();
        *//*Date startDate = new Date();

        startDate.setDate(1);
        startDate.setMonth(0);*//**//*
        //Date currentTime = new Date();
        long msDay = 24 * 60 * 60 * 1000;
        long msTimeDistance = countDate.getTime() - startDate.getTime();
        int dayCount = (int) (msTimeDistance/msDay);*//*
        isDateOdd.();
        System.out.println(countDate.getTime());
        isDateOdd(currentTime.getTime());
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date();
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        Date countDate = new Date(date);
        long msDay = 24 * 60 * 60 * 1000;
        long msTimeDistance = date - yearStartTime.getTime();
        int dayCount = (int) (msTimeDistance/msDay);

        if (dayCount % 2 == 0)
        return true;
        else
            false;
    }
}*/


//////////////////////////////////////////////////////////////////////////////
/*public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        return true;
    }
}*/
