package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foodList = new String[0];
        while (true) {
            System.out.println("1번을 누르면 추가되고 2번을 누르면 제거 됩니다.");
            String inputNum = sc.nextLine();
            int result = 0;
            try {
                result = Integer.parseInt(inputNum);
            } catch (Exception e) {
                System.out.println("정수로 입력해주세요");
            }

            switch (result) {
                case 1:
                    System.out.println("먹고 싶은 음식을 입력하세요!!");
                    System.out.println("입력을 중지하려면 <그만>이라고 입력하세요");
                    String food = sc.next();
                    if (!food.equals("그만")) {
                        String[] copyFoodList = new String[foodList.length + 1];
                        for (int i = 0; i < foodList.length; i++) {
                            copyFoodList[i] = foodList[i];
                        }
                        copyFoodList[copyFoodList.length - 1] = food;
                        foodList = copyFoodList;
                        copyFoodList = null;
                        System.out.println("먹고 싶은 음식 리스트: " + Arrays.toString(foodList));
                    } else {
                        System.out.println("먹고 싶은 음식 리스트: " + Arrays.toString(foodList));

                    }
                    break;
                case 2:
                    System.out.println("리스트가 제거됩니다.");
                    if (foodList.length > 0) {
                        String[] copyFoodList = new String[foodList.length - 1];
                        for (int i = 0; i < copyFoodList.length; i++) {
                            copyFoodList[i] = foodList[i];
                        }
                        foodList = copyFoodList;
                        copyFoodList = null;
                        System.out.println("먹고 싶은 음식 리스트: " + Arrays.toString(foodList));
                    } else {
                        System.out.println("더이상 제거할 음식이 없습니다.");
                    }
            }
            sc.close();
        }


//        String[] foodList = {};

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */

    }
}
