package com.javarush.test.level09.lesson08.task05;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution
{
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj)
    {
        try
        {
            obj.method1();
            obj.method2();
            obj.method3();
        }
           /* catch(Exception exception)//можно этим одним блоком заменить все три ниже
            {
                printStack(exception);

            }*/
        catch(NullPointerException exception)
            {
                printStack(exception);

            }
        catch(IndexOutOfBoundsException exception)
            {
                printStack(exception);

            }
        catch(NumberFormatException exception)
            {
                printStack(exception);

            }
        }
/*из мейна вызывается метод processExceptions(new Solution()); в котором вызывается метод obj.method1();
 в котором если лшибка то идет в catch который вызывает метод printStack() который выводит неведомую хрень.
  Далее вызывается metod2*/


    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
