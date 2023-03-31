package day03;
import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String food) {
        String[] copyFoods = new String[foods.length + 1];

//        System.out.println(copyFoods.length);
        for (int i = 0; i < foods.length; i++) {
            copyFoods[i] = foods[i];
        }
        copyFoods[copyFoods.length - 1] = food;
        foods = copyFoods;
        copyFoods = null;
        System.out.println(Arrays.toString(foods));
    }

    static int indexOf(String food) {

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                index = i;
                break;
            } else {
                index = -1;
            }

        }
        return index;
    }

    static String[] remove(String food) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                index = i;
            }

        }
        if (index >= 0) {

            for (int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            String[] copyFoods = new String[foods.length - 1];
            for (int i = 0; i < copyFoods.length; i++) {
                copyFoods[i] = foods[i];
            }
            foods = copyFoods;
            copyFoods = null;
            System.out.println(Arrays.toString(foods));
            System.out.println(food + "가 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 음식명 입니다.");
        }
        return foods;

    }

    static boolean include(String food) {
        boolean result = false;
        for (String s : foods) {
            if (s.equals(food)) {
                result = true;
            }
        }
        return result;
    }

    static String[] insert(int index, String food) {
        String[] copyFoods = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            copyFoods[i] = foods[i];
        }
//        System.out.println(Arrays.toString(copyFoods));
        for (int i = copyFoods.length - 1; i > index; i--) {
            copyFoods[i] = copyFoods[i - 1];
        }
        copyFoods[index] = food;
        foods = copyFoods;
        copyFoods = null;
        System.out.println(Arrays.toString(foods));
        return foods;
    }

    static String[] modify(int index, String food) {
        foods[index] = food;
        System.out.println(Arrays.toString(foods));
        return foods;
    }

    static String[] clear() {
        String[] copyFoods = new String[0];
        foods = copyFoods;
        copyFoods = null;
        System.out.println(Arrays.toString(foods));
        return foods;
    }

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println(idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();


        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println(flag);
//        System.out.println(flag2);

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        clear();  // foods배열 모든 데이터 삭제


    }
}
