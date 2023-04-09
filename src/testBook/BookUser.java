package testBook;

import day05.member.Gender;

public class BookUser {
    private String name; // 도사관 회원 이름
    private int age; // 도서관 회원 나이
    private Gender gender; //  성별
    private int couponCount;

    private Book[] rentBookList; // 빌린 책 정보들

    public BookUser() {
    }

    public BookUser(String name, int age, Gender gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }


    public String getGenderToString() {
        return (gender == Gender.FEMALE) ? "FEMALE" : "MALE";
    }

}
