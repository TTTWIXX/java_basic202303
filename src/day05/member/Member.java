package day05.member;

import java.time.LocalDate;

// 역할: 1명의 회원정보를 묶어주는 역할
// Java Bean
public class Member {
    // 필드
    int memberId;
    String email;
    String password;
    public String memberName;
    Gender gender;
    int age;

    // 회원가입일
    LocalDate regDate;

    //생성자
    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    // 회원정보를 문자열로 만들어서 리턴하는 기능
    public String inform() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";

        return String.format("# %d번 | %s | %s | %s | %d세"
                        , this.memberId, this.email, this.memberName
                        , convertGender, this.age
        );
    }
}
