package ru.efremovdm.lesson6;

public class Cat extends Animal {

    private double runMax = 200;
    private double swimMax = 0;

    public Cat() {}

    public Cat(double run, double swim) {
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