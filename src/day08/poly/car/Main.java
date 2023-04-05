package day08.poly.car;

import static day07.newutli.Utility.*;

public class Main {
    public static void main(String[] args) {

        CarShop shop=new CarShop();
//        shop.runTest(cars);

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());

        Mustang mustang =new Mustang();
        mustang.accelerate();
//      mustang.powerSound();

        Stinger stinger=new Stinger();
        stinger.accelerate();

        Car car = (Mustang) shop.exportCar(60000); //mustang의 원본기능이 필요할때는 downcasting을 하면된다.
        System.out.println(car instanceof Stinger); //
        System.out.println(car instanceof Tucson); //
        System.out.println(car instanceof Mustang); // type 검사

//        System.out.println("car = " + car);

//        car.powerSound();

    }
}
