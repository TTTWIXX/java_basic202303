package testJava;

public class TestMember {
    //필드,전역변수, 멤버변수
    int memberId;
    String email;
    String password;
    String memberName;
    Gender gender;
    int age;

    public TestMember(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    String imform() {
        String convertgender = (gender == Gender.MALE) ? "남성" : "여성";
        return String.format("#%d|%s|%s|%s|%d세", memberId, email, memberName, convertgender, age);
    }


}
