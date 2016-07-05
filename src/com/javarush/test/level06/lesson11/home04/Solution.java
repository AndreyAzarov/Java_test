package com.javarush.test.level06.lesson11.home04;

/* Минимальное количество static-ов
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась
*/

public class Solution
{
    public static int step;//Метод public static void method2() каждый раз создает новый экземпляр класса с не инициализированной переменной public int step;
// поэтому чтобы программа завершилась нужно чтобы переменная step была статическая. Таким образом условие if (step > 1) return; — никогда не выполниться и программа бесконечно повторяет метод main.
    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        method2();
    }
    public static  void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }
    /*методы main и первый метод инициализируются до создания экземпляра класса, а во втором методе мы создаем объект(экземпляр класса) Solution,
    поэтому смысла в статиках в третьем и четвертом методе нет, так как они все-равно прогрузятся после создания объекта.*/
    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1) return;
        main(null);
    }
}
