package day09.final_;
//class SmartBagPack extends BagPack{}
//final은 상속 x


final class BagPack{
    // 속성
    int size; // 가방 크기 (1~10)
    String brand; // 브랜드

    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }


    // 기능
    final void putItem(){
        System.out.println("가방에 물건을 넣습니다.");
        // 클래스에 final이 붙으면 전부 오버라이딩이 안된다.
        // 메소드에 final이 붙으면 붙은 메소드만 오버라이딩이 되지않는다.
    }
    void getItem(){

    }

}
public class Person {
    String name; // 이름
   final String ssn; // 주민번호

    //상수는 유일성, 불변성을 만족해야한다.

    static final String nation="대한민국"; // 국적
    BagPack bagPack; // 가방



    public Person(String name, String ssn,  BagPack bagPack) {
        this.name = name;
        this.ssn = ssn;
//        this.nation = nation; 상수화 되었다. 초기화 x
        this.bagPack = bagPack;
    }

}
