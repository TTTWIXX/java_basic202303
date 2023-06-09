package day03;

public class MethodBasic {
    // 함수: 코드블록의 기능적 표현(java는 없다, java는 객체지향프로그램)
    // ex) add(10,20);
    // 메서드: 객체의 동작 표현
    // ex) 샤프계산기.add(10,20)

    // 자바는 모든것을 객체로 표현하고, 함수마저도 모두
    // 메서드로 처리한다.
    // 자바의 메서드는 클래스 내부에만 선언이 가능
    // 다른 메서드 안에서 선언할 수 없음.(함수 안에서 함수 선언 xxxxxx)
    // 2개의 정수를 더해서 리턴하는 메서드

    // 리턴값이 없는 함수
    static void makeLine() {
        System.out.println("-4444444");
    }

    // 여러 값을 리턴하고 싶은 경우
    // 2개 정수 전달하면 덧셈, 뺄셈, 곱셈 결과 리턴
    int[] operateAll(int n1, int n2) {

        int[] ints = {
                n1 + n2,
                n1 - n2,
                n1 * n2
        };
        return ints;
        // new int 에 마우스 올리고 ctrl+alt+v;
        // ctrl+alt+n
        // 빠른퇴근 ㅇㅇ
        // shift+f6 // jscode 에서의 f2

    }


    int add(byte n1, byte n2) {
        return n1 + n2;
    }
    // n개의 정수를 전달받아 총합을 리턴
    static int addAll(int... numbers){
        int total=0;
        for (int number : numbers) {
            total+=number;
        }
        return total;
    }

    // 2개의 정수배열을 전달받아
    // 들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
    static int[] compareNumbers(int[] arr1,int[] arr2){
        return arr1.length > arr2.length ? arr1 : arr2;
        // alt 눌러서 삼항연산자로 변환 가능
    }


    public static void main(String... args) {
        makeLine();
    // ... 배열이 아니면 배열로 묶어준다.
        addAll(new int[]{10,20,30});

    }
}
