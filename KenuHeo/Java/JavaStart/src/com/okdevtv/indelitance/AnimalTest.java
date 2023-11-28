package com.okdevtv.indelitance;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.name = "바둑이";
        animal.legs = 4;

        System.out.println(animal.getInfo());

        testTiger();
        testChicken();
    }

    private static void testChicken() {
        Chicken chicken = new Chicken();
        chicken.name = "닭";
        chicken.legs = 2;
        chicken.wings = 2;
        printInfo(chicken);
    }

    private static void printInfo(Animal animal) {
        System.out.println(animal.getInfo());
    }

    private static void testTiger() {
        Tiger tiger = new Tiger();

        tiger.name = "호돌이";
        tiger.legs = 4;

        printInfo(tiger);
        //System.out.println(tiger.getInfo());
    }

}
