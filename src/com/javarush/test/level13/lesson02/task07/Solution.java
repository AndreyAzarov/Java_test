package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }
/*Дженерики используются, что бы не указывать явно тип(класс) используемых объектов,
* generics (дженерики) или <<контейнеры типа T>> — подмножество обобщённого программирования.*/
    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
        //Фактически Т – это тип, который должен быть определён позже (при создании объекта класса).
    }

    class StringObject implements SimpleObject<String>
            //допишите здесь ваш код
    {

       // SimpleObject<String> obj = new StringObject();


        public SimpleObject<String> getInstance()
        {
            return null;
        }
    }
}

///////////////////////////
/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    class StringObject  //допишите здесь ваш код

}*/