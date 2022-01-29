package ru.efremovdm;

import java.util.Random;

public class HomeWorkApp2 {

    /**
     * 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
     */
    public static void main(String[] args) {

        boolean check = checkSumm(5, 10);
        System.out.println(check);

        checkInt(new Random().nextInt());

        boolean check2 = checkInt2(new Random().nextInt());
        System.out.println(check2);

        printStr("Пример строки", 10);

        boolean year1 = checkYear(1984);
        System.out.println(year1);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
     * пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * @param a
     * @param b
     * @return boolean
     */
    private static boolean checkSumm(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     * @param a
     */
    private static void checkInt(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * @param a
     * @return
     */
    private static boolean checkInt2(int a) {
        return a < 0;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     * @param str
     * @param count
     */
    private static void printStr(String str, int count) {
        for (int i=0; i<count; i++) {
            System.out.println(str);
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
     * (високосный - true, не високосный - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.
     * @param year
     * @return
     */
    private static boolean checkYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 100 == 0 && year % 400 == 0);
    }
}
