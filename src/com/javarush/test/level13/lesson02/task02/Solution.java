package com.javarush.test.level13.lesson02.task02;

/* Пиво: возвращение
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*Если класс ClassA реализует интерфейс InterfaceA,
        то ссылки на экземляр данного класса могут храниться в переменных типа InterfaceA.*/
        Drink beer = new AlcoholicBeer();// ссылка идёт через полный класс,
        System.out.println(beer.toString());
    }
    /*Интерфейс - это обычно просто набор методов.
    Соответственно, если у тебя ссылка идёт через полный класс, то ты можешь вызывать все методы
    (включая все методы имплементированных интерфейсов), а если ссылка идёт через интерфейс,
    то ты можешь через неё вызвать только методы этого интерфейса.*/

    public interface Drink
    {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements  Drink
    {
        //@Override
        public boolean isAlcoholic()
        {
            return true;//здесь ставим true  т.к. у нас пиво это алкогольный напиток и метод который проверяет
            // это алкогольный напиток или нет должен возвращать истину.
        }

        @Override
        public String toString()
        {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            }
            else {
                return "Напиток безалкогольный";
            }

        }

    }
}

///////////////////////////////////////
/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink
    {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer
    {
        @Override
        public String toString()
        {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            }
            else {
                return "Напиток безалкогольный";
            }

        }

    }
}*/
