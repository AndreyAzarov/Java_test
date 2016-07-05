package com.javarush.test.level08.lesson08.task05;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//import java.util.Iterator;

 /*Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        //removeItemFromMapByValue(map);

        System.out.println(map);


    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<>();


        map.put("фамилия1", "имя1");
        map.put("фамилия2", "имя1");
        map.put("фамилия3", "имя1");
        map.put("фамилия4", "имя1");
        map.put("фамилия5", "имя5");
        map.put("фамилия6", "имя6");
        map.put("фамилия7", "имя7");
        map.put("фамилия8", "имя8");
        map.put("фамилия9", "имя8");
        map.put("фамилия10", "имя8");

        return map;
        //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            //String key = pair.getKey();
            String value = pair.getValue();

            if (Collections.frequency(copy.values(), value) > 1)/*вернули коллекцию только величин и подсчитали сколько
                раз повторяются величины(элементы возвращенной коллекции)*/
                removeItemFromMapByValue(map, value);/*вызвали метод по удалению величин которые встретились в коллекции величин больше одного раза*/
        }
        //напишите тут ваш код

    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copymap = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copymap.entrySet())//итерацию проводим по копии нашего множества
        //таким образом наше множество не меняется а меняется оригинальное т.к. из него мы удаляем элементы
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}

/*
public class Solution {

    public static void main(String[] args) throws Exception {
        Map<String, String> a = createMap();
        removeTheFirstNameDuplicates(a);
        for (Map.Entry<String, String> pair : a.entrySet())
        {
            System.out.println(pair);
        }
    }

    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Петр");
        map.put("2", "Сидор");
        map.put("3", "Иван");
        map.put("4", "Иван");
        map.put("5", "Петр");
        map.put("6", "Сидор");
        map.put("7", "Иван");
        map.put("8", "Петр");
        map.put("9", "Сидор");
        map.put("10", "Степан");

        return (HashMap<String, String>) map;
    }

    public static <K, V> void removeTheFirstNameDuplicates(Map<K, V> map) throws Exception {
        Map<K, V> tmp = new HashMap<K, V>();
        for (Iterator<K> it = map.keySet().iterator(); it.hasNext();) {
            K key = it.next();
            V val = map.get(key);
            if (!tmp.containsValue(val)) {
                tmp.put(key, val);
            }
        }
        map.clear();
        for (Iterator<K> it = tmp.keySet().iterator(); it.hasNext();) {
            K key = it.next();
            map.put((K) tmp.get(key), (V) key);
        }
    }
}*/
