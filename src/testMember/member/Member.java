package testMember.member;

// 역할: 1명의 회원정보를 묶어주는 역할
// Java Bean
public class Member {
    // 필드
    int memberId;
    String email;
    String password;
    String memberName;
    Gender gender;
    int age;

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
}
