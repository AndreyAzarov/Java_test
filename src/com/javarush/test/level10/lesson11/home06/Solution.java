package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        double high;
        String lastName;
        String national;

        public Human()
        {
            sex = true;
        }
        public Human(int age, boolean sex, String national)
        {
            this.age = age;
            this.sex = sex;
            this.national = national;
        }
        public Human(String lastName, String name)
        {
            this.lastName = lastName;
            this.name = name;

        }
        public Human(Human man)
        {
            sex = man.sex;

        }
        public Human(String lastName, String name, int age, boolean sex, String national, double high)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.high = high;
            this.lastName = lastName;
            this.national = national;
        }
        public Human(double high)
        {
            this.high = high;
        }
        public Human(String i, int j)
        {
            lastName = i;
            age = j;
        }
        public Human(boolean i, double j)
        {
            sex = i;
            high = j;
        }
        public Human(Human woman, String i)
        {
          sex = woman.sex;
            name = i;
        }
        public Human(double high, String i)
        {
            this.high = high;
            national = i;
        }



        //напишите тут ваши переменные и конструкторы
    }
}

///////////////////
/*public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {

        //напишите тут ваши переменные и конструкторы
    }
}*/