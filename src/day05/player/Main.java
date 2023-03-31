package day05.player;

public class Main {

    public static void main(String[] args) {



        Player parking = new Player("주차왕파킹");
        Player gondue = new Player("딸귀겅듀");
        Player noname = new Player();

//        gondue.attack(parking);
//        parking.attack(gondue);
        System.out.println("target의 주소:"+parking);
        System.out.println("주차왕 남은체력: "+parking.hp);
    }
}
