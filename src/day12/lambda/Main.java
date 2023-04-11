package day12.lambda;

import day05.member.Gender;
import day05.member.Member;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


import static day07.newutli.Utility.*;
import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.map;


public class Main {
    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN),
                new Apple(80, GREEN),
                new Apple(80, RED),
                new Apple(97, RED),
                new Apple(200, GREEN),
                new Apple(50, RED),
                new Apple(85, YELLOW),
                new Apple(75, YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 ========");
        List<Apple> greenApples
                = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========= 녹색 사과 필터링 ========");
        List<Apple> colorApples
                = filterApplesByColor(appleBasket, YELLOW);
        for (Apple colorApple : colorApples) {
            System.out.println(colorApple);
        }

        // 100g 이하 사과들
        List<Apple> filterApples = filterApples(appleBasket, new LightApplePredicate());
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }
        // 빨강 사과 필터링
        List<Apple> filterApples1 = filterApples(appleBasket, apple -> apple.getColor() == RED);
        for (Apple apple : filterApples1) {
            System.out.println(apple);
        }

        makeLine();
        // 녹색이면서 100g보다 큰 사과들만 필터링 (익명)

        List<Apple> greenNLargeApple = filterApples(appleBasket, apple ->
                apple.getColor() == GREEN && apple.getWeight() > 100);
        for (Apple apple : greenNLargeApple) {
            System.out.println(apple);
        }

        System.out.println("==========================");
        filter(appleBasket, apple -> apple.getWeight() > 100
                && apple.getWeight() <= 150);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        filter(numbers, n -> n % 2 == 0);

        List<String> wordList = List.of(
                "moments", "hello", "apple", "banana", "ace", "base", "zebra"
        );

        filter(wordList, w -> w.length() == 5);


        List<String> filter3
                = wordList.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList());

        makeLine();
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : appleBasket) {
            colorList.add(apple.getColor());
        }
        System.out.println(colorList);
// 회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member(1, "abc1@ddd.com", "1234", "홍길동", day05.member.Gender.MALE, 33)
                , new Member(2, "abc2@ddd.com", "4444", "김길동", day05.member.Gender.FEMALE, 23)
                , new Member(3, "abc3@ddd.com", "3333", "이길동", day05.member.Gender.MALE, 43)
                , new Member(4, "abc4@ddd.com", "5555", "박길동", day05.member.Gender.FEMALE, 53)
                , new Member(5, "abc5@ddd.com", "1111", "송길동", Gender.MALE, 63)
        );

        List<String> nameList
                = map(memberList, m -> m.memberName);
        System.out.println("nameList = " + nameList);

    }

}
