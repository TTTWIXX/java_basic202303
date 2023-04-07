package day10.collection.map_;

import day09.musicquiz.Artist;

import java.util.HashMap;
import java.util.Map;

import static day07.newutli.Utility.makeLine;

public class MapExample {
    public static void main(String[] args) {

    //iterable 인터페이스 없음 : for 문 안됌.
    Map<String, Object> map =new HashMap<>();

    //put(K,V) : 데이터 추가
        map.put("지갑잔액",5000);
        map.put("좋아하는 가수",new Artist("동방신기",null));
        map.put("저녁메뉴","볶음밥");

        System.out.println(map.size());
        //쌍의 개수를 세준다.

        //get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);

        dinner.toUpperCase();

        map.put("저녁메뉴","짬뽕"); // 수정
        System.out.println(map);

        // 반복문 처리
        for (String key : map.keySet()) {
                            // map의 key값만 가져와서 set으로 바꿔서 반복문
            System.out.println("key = " + key);
            System.out.println("value = " +map.get(key));
            makeLine();

        }


    }


}
