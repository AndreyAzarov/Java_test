package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addressesTown = new ArrayList<String>();
        List<String> addresses = new ArrayList<String>();
        while (true)
        {

            String townName = reader.readLine();
            addressesTown.add(townName);
            if (townName.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            addresses.add(family);

        }
        String townName = reader.readLine();

        for (int i = 0; i < addresses.size(); i++)
        {
            if (addressesTown.get(i).equals(townName))
            {
                System.out.println(addresses.get(i));
            }
        }
    }
}
/////////////////////////////////////////////////////////

/*Ввод:

Ивановы
Петровы
Абрамовичи

2

вывод: // считаем с нуля массив естественно

Абрамовичи


*/



/*public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());


        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
    }
}
*/
