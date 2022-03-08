package com.company;

public class Cat extends Animal{
    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(int age, String name, int sleepsHours) {
        super(age, name);
        this.sleepsHours = sleepsHours;
    }

    private int sleepsHours;

    @Override
    public void print() {
        super.print();
        System.out.println(getInfo() + "\nsleepsHours:" + sleepsHours);
    }
}
