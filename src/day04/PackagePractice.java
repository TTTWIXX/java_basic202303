package day04;
//import fruit.Banana;
//import fruit.Grape;
// 클래스 밖 package 아래쪽
// package는 소문자 작성, 클래스는 대문자 작성
//
import  fruit.*;
public class PackagePractice {

    public static void main(String[] args) {

        new juice.Apple();

        Banana banana = new Banana();
        // 다른 패키지에 있는 객체를 가져오고 싶으면
        // 구분하기 위해 앞쪽에 package를 적어준다.
        new Grape();

        java.util.Scanner sc=new java.util.Scanner(System.in);
        // 이게 원래 표현이다.

    }
}
