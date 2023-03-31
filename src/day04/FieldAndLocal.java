package day04;

public class FieldAndLocal {

    int a; //필드
    double b; //기본값: 0.0
    double[] e; //기본값: null;

    void mm(int b){ // b:매개변수
        int c=0; // c: 지역변수

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //셋다 초기화를 하지않았지만 c한테만 뭐라고 하네?
        // a는 0을 넣어둔다.
        // b는 값이 들어올수 밖에없는 구조
        // c는 우리가 넣지않으면 영원히 들어오지 않는다.

    }


}
