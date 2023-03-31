package day02;

import java.util.Arrays;

public class ArrayPop {
    public static int pop() {

        if (arr.length > 0) {
            //배열의 맨 끝 테이터 삭제후 삭제
            int[] arr = {10, 20, 30, 40, 50};
            //0. 삭제 대상 대이터 백업
            int delTarget = arr[arr.length - 1];

            //1. 원본 배열보다 1개 사이즈 작은 새배열 생성
            int[] copyArr = new int[arr.length - 1];

            //2. 맨 마지막 데이터만 빼고 모두 새배열 복사
            for (int i = 0; i < copyArr.length; i++) {
                copyArr[i] = arr[i];
            }
//        3.주소값 이전
            arr = copyArr;
            copyArr = null;

            return delTarget;
        }
        System.out.println("삭제 데이터없음!");
        return 0;
    }
    static  int[] arr={10,20,30,40,50};
    public static void main(String[] args) {
        pop();
        pop();
        pop();

        System.out.println(Arrays.toString(arr));

    }
}
