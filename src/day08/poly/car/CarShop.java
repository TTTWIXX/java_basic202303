package day08.poly.car;


// 자동차 판매 대리점
public class CarShop {

    Car[] car;

//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;

    // 대리점에 차을 입고하는 기능
    public void importCar() {

//        mustangs = new Mustang[]{
//                new Mustang(),
//                new Mustang(),
//                new Mustang()
//        };

        Car[] cars = {
                new Mustang(),
                new Mustang(),
                new Mustang()
        };
        // 문자열과 정ㅇ수와 논리를 배열에 담을 수 있는가
        Object[] OArr = {
                50, 30, 3, 3, "zzzz", false, new Mustang()
        };

    }


    public void runTest(Car[] cars) {
        importCar(); // 차 입고
        for (Car car : cars){
            car.accelerate();
        }
    }

    public Car exportCar(int money){
        if(money==6000){
            return new Mustang();
        }else if(money ==5000){
            return new Stinger();
        }else if(money ==3000) {
            return new Tucson();
        }else{
            return null;
        }

    }
}
