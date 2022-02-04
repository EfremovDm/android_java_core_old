package ru.efremovdm;

import java.util.Arrays;
import java.util.Random;

/**
 * Урок 3. Практика: разбор примеров использования базовых элементов языка Java
 */
public class HomeWorkApp3 {

    public static void main(String[] args) {

        makeArr1(10);

        makeArr2(100);

        makeArr3();

        makeArr4(10);

        int[] arr = makeArr5(20, 5);
        System.out.println(Arrays.toString(arr));
        makeArr6(20);

        int[] arr2 = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = makeArr7(arr2);
        System.out.println(result);
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * @param len
     */
    private static void makeArr1(int len) {

        int[] arr = new int[len];
        Random rnd = new Random();

        // наполнение массива массива
        for (int i = 0; i < len; i++)
            arr[i] = rnd.nextInt(2);

        // замена цифр
        for (int i = 0; i < len; i++)
            arr[i] = arr[i] > 0 ? 0 : 1;

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     *
     * @param len
     */
    private static void makeArr2(int len) {

        int[] arr = new int[len];

        for (int i = 0; i < len; i++)
            arr[i] = i + 1;

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void makeArr3() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     *
     * @param size
     */
    private static void makeArr4(int size) {

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = i == j || i + j + 1 == 10 ? 1 : 0;
            }
        }

        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     *
     * @param len
     * @param initialValue
     * @return int[]
     */
    private static int[] makeArr5(int len, int initialValue) {

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     *
     * @param len
     */
    private static void makeArr6(int len) {

        int[] arr = new int[len];

        Random rnd = new Random();

        // наполнение массива
        for(int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(100);
        }

        // поиск минимального и максимального
        int min = 0;
        int max = 0;
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     * **Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     *
     * @param arr
     * @return boolean
     */
    private static boolean makeArr7(int[] arr) {

        int a = 0;
        int b = 0;

        for (int j : arr) {
            a += j;
        }

        for (int j : arr) {
            a -= j;
            b += j;
            if (a == b)
                return true;
        }

        return false;
    }
}