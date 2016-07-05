package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> hm = new HashMap<String, Cat>();
        for (int i = 0; i < cats.length; i++)
        {
            hm.put(cats[i], new Cat(cats[i]));
        }
               return hm;
 ///////////////////////////////////////////////////////////////
//второй вариант цикла

// for (Map.Entry<String, Double> catsName : hm.entrySet())  - такой вариант не катит т.к. у нас коллекция неинециализированна еще.

        /*for (String  catsName : cats)
        {
            hm.put(catsName, new Cat(catsName));
        }
              return hm;*/
                //напишите тут ваш код
/////////////////////////////////////////////////////////////////////////
    }
    public static class Cat
    {
        String name;

        public Cat(String name)
        {

            this.name = name;
        }

        @Override
        public String toString()/*этот метод используется для получения строкового представления объекта.
        Вы можете (и обычно должны) переопределить этот метод для записываемых вами классов. */
        {

            return name != null ? name.toUpperCase() : null;
        }
    }
}


//===========================================================================
/////////////////////////пример использования entrySet()////////////////////
/*/**
 *Output:
D: 99.22
A: 3434.34
C: 1378.0
B: 123.22
E: -19.08

B's new balance: 1123.22
 */

/*import java.util.HashMap;
        import java.util.Map;
        import java.util.Set;

public class MainClass {
    public static void main(String args[]) {

        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("A", new Double(3434.34));
        hm.put("B", new Double(123.22));
        hm.put("C", new Double(1378.00));
        hm.put("D", new Double(99.22));
        hm.put("E", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("B");
        hm.put("B", balance + 1000);

        System.out.println("B's new balance: " + hm.get("B"));
    }
}*/
