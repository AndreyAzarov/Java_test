package com.javarush.test.level07.lesson12.home05;

import java.lang.Thread;//добавить обязательно
/* Бум
Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
Пример:
30
29
…
1
0
Бум!
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException//добавить обязательно
    {/*Notice that main declares that it throws InterruptedException.
         This is an exception that sleep throws when another thread interrupts
         the current thread while sleep is active.
         Since this application has not defined another thread to cause the interrupt,
         it doesn't bother to catch InterruptedException.*/
        for (int i=30;i>=0;i--)
        {
            Thread.sleep(100);
            System.out.println(i);
            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
