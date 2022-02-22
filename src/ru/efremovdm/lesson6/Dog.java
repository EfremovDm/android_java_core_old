package ru.efremovdm.lesson6;

public class Dog extends Animal {

    private double runMax = 500;
    private double swimMax = 10;

    public Dog() {}

    public Dog(double run, double swim) {
        runMax = run;
        swimMax = swim;
    }

    @Override
    public boolean run(double run) {
        return run <= runMax;
    }

    @Override
    public boolean swim(double swim) {
        return swim <= swimMax;
    }
}