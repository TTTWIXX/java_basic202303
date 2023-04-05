package day08.poly;

import day08.poly.car.Car;
import day08.poly.car.Mustang;
import day08.poly.car.Stinger;

public class Main {
    public static void main(String[] args) {

        //객체는 항상 역할에 의존해야지 구현체에 의존하면 안됨

        Computer com =new Computer();
        LgMonitor lgMonitor = new LgMonitor();
        com.lgMonitor=lgMonitor;

        //모니터 교환
        com.lgMonitor=new HpMonitor();


    }
}
