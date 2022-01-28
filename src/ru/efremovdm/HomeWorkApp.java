package ru.efremovdm;

import java.util.Random;

public class HomeWorkApp {

    /**
     * 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
     */
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    /**
     * 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
     * значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна
     * 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */
    private static void checkSumSign() {

        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println("Сумма " + (a + b >= 0 ? "положительная" : "отрицательная"));
    }

    /**
     * 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     * если больше 100 (100 исключительно) - “Зеленый”;
     */
    private static void printColor() {

        Random random = new Random();

        int value = random.nextInt();

        String result;

        if (value <= 0)
            result = "Красный";
        else if (value <= 100)
            result = "Желтый";
        else
            result = "Зеленый";

        System.out.println(result);
    }

    /**
     * 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести
     * в консоль сообщение “a >= b”, в противном случае “a < b”;
     */
    private static void compareNumbers() {

        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}