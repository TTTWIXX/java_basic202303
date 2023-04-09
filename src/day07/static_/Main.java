package day07.static_;


import static day07.newutli.Utility.*;
import static java.lang.Math.*;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {

        out.println(Count.x);
        out.println(random());

        Count.m1();//메모리 한개이므로 객체생성 안하고 클래스. 으로 호출
        //c2.m2(); 객체 생성을 하고 불러야 한다.

        Count c1 = new Count();
        Count c2 = new Count();

        //c1.x=10;
        Count.x = 10; // 객채에 따라 영향이없으므로 그냥 클래스.x로 정의한다.
        c2.y = 20;
        c2.x++;

        out.printf("c1 = x: %d, y:%d\n", c1.x, c1.y);
        out.printf("c2 = x: %d, y:%d\n", c2.x, c2.y);
        //객체를 100개 만들어도
        //static은 클래스별 1개만 존재

        Calculator sharp = new Calculator();
//        sharp.cal

        Calculator.calcAreaCircle(5);
        makeLine();
        makeLine(); // import걸어두면 static 필드와 메서드를 그냥 참조 가능


    }
}
