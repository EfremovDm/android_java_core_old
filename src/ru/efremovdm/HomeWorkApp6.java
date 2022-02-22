package ru.efremovdm;

import ru.efremovdm.lesson6.*;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 *
 * У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *
 */
public class HomeWorkApp6 {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(400, 10),
                new Dog(600, 10)
        };

        for (Animal animal : animals) {

            System.out.printf(
                    "%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(500)
            );

            System.out.printf(
                    "%s jump: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(500)
            );

            System.out.printf(
                    "%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8)
            );
        }
    }
}