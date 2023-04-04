package day07.static_;

public class Calculator {

    String color; // 계산기 색깔
    static double pi;  // 원주율 // 하나 만들어서 돌려쓰면되잖아~ 왜 100개씩만들어~

    Calculator cal1=new Calculator();
    Calculator cal2=new Calculator();

    // 원의 넓이 구하는 메서드
    static double calcAreaCircle(int r){
        return pi*r*r;
    }

    //계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color){
        this.color=color;
    }


}
