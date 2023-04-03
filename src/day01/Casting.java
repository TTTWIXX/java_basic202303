package day01;

public class Casting {
    public static void main(String[] args) {
       
        byte a=100;
        //java는 같은 타입끼리만 연산이 가능하다
        int b=a;
        // 여기서는 자동으로 a앞에 int를 넣어 연산해준다.
        // int를  더큰 byte타입으로 볼수도있기 때문이다.
        // 작은집에서 큰집은 그냥 이사해준다.



        // +8: 00001000
        // 1의보수 변환 : 비트 반전
        // -8: 11110111
        // 2의보수 변환 : +1
        //     11111000

        //  00001000
        //  11110111
        //1 00000000
        //앞 1은 자리가 없어서 지워짐



        // MSB : 0은 양수 ,1은 음수
        // c: 00000000 00000000 00000011 11101000
        int c = 1000;

        //d d: 1 1101000
        byte d=(byte)c;
        // 큰집에서 작은집으로 옮기면 데이터가 다 안넘어가서
        // 내가 원하는 데이터가 아닐수있다.
        System.out.println("d = " + d);


        double x=3.5566;
        int y =(int) x;
        System.out.println("y = " + y);
        // 다운캐스팅은 데이터소실의 위험성이 있다.

        // 타입이 다른 데이터의 연산
        // 타입이 다르면 큰 타입에 맞춰서 변환한 후 연산 진행
        int k = 100;
        double j = 5.5;
        double v = k + j;

        char c1 = 'A';
        int alpha = 1;
        System.out.println(c1+alpha);

        // int보다 작은데이터(byte, short, char)끼리의
        // 연산은 무조건 둘다 int로 변환된다.
        char c2= 'B';
        char c3= 'a';
        System.out.println(c2+c3);
        

        byte b1=100;
        byte b2=30;

        //byte b3=b1+b2; 오류!!!!!!!!!!!!
        int b3=b1+b2;
        //System.out.println(b3);


        
        int g= 24;
        double result=g/5.0;
        // 둘중 하나만 바꿔줘도 연산시 자동으로 큰쪽으로 형변환이 된다.
        // 예> 5->5.0 or g-> (double)g
        // (double)(g/5); 는 이미 연산을 하고 타입을 붙이는 것이므로 의미가없다.
        System.out.println("result = " + result);


    }
}
