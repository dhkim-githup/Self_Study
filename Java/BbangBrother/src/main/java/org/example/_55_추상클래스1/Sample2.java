package org.example._55_추상클래스1;

public class Sample2 {

    public static void main(String[] args) {
        Car car1 = new ElectricCar("빨강","현대");
        car1.printInfo();
        //car1.setColor2("녹색");
        //car1.printInfo();
        System.out.println("-------------------------------------");

        ElectricCar car2 = new ElectricCar("빨강","현대");
        car2.printInfo();
        car2.setColor2("녹색");
        car2.printInfo();
        System.out.println("-------------------------------------");

        car1 = new GasCar("빨강","현대");
        car1.printInfo();

    }
}
