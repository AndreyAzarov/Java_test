package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

        //System.out.println(arrayList.get(arrayList));
        /*System.out.println(arrayList);
        System.out.println(linkedList);*/

    }

    public static void insert10000(List list)
    //Оба эти списка унаследованы от общего интерфейса List, что и позволяет нам передавать в метод не сами списки,
    // а аргумент с типом (List list) их общего родителя.
    // В противном случае пришлось бы делать два отдельных метода, по одному для каждого списка.
    {
        for (int i = 0; i < 10000; i++)
        {
            list.add(i);
        }
        //напишите тут ваш код

    }

    public static void get10000(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.get(i);
        }
        //напишите тут ваш код

    }

    public static void set10000(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.set(i, "Array");
        }
        //напишите тут ваш код

    }

    public static void remove10000(List list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {//т.к. у насэто коллекции а в случае с linkedList имеем дело с массивом ссылок то мы
            //  не сможем начать удалять с первого элемента т.к. он содержит ссылку на следующий
            // и тогда мы не знаем где находится следующий элемент. Поэтому нужно удалять с конца.
            list.remove(i);
        }

        /*метод remove проще реализовать так: for (int i=0;i<10000;i++) { list.remove(0); }
        * в этом случае всегда удаляем нулевой элемент и ссылки не нужны для поиска и удаления следующего
        * если инкрементировать счетчик, то метод удаляет элементы коллекции через один,
         * как ни прискорбно. По сути, нужно счетчик не инкрементировать.*/
         /*как ни прискорбно. По сути, нужно счетчик не инкрементировать.*/

        //напишите тут ваш код

    }
}

