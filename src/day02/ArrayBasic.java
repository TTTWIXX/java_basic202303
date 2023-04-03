package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 배열을 객체 생성

        // 동종모음 구조
        int[] arr = new int[5];
        //int[] 인트배열타입 8byte타입
        System.out.println("arr = " + arr);

        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        // arr[5]=50; 런타임 에러  // 인덱스는 4번까지

        // 배열의 길이 - 저장 데이터 개수
        System.out.printf("배열의 길이 : %d\n ", arr.length);

        //자바의 배열은 값을 넣지 않아도 길이는 변하지않는다.
        //자바의 배열 immutable(불변성)

        
        // 배열 반복문 처리- 단축키 iter
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터: %d\n", i + 1, arr[i]);


        }

        // foreach문- 단축키 iter
        System.out.println("======================");
        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);

        }
        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);
        }
        // 배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));

    }

}
