package testJava;


import day05.member.Member;

public class TestMemberRepository {
    TestMember[] testMemberList;
    public static final int NOT_FOUND = -1;

    public TestMemberRepository() {
        this.testMemberList = new TestMember[3];
        testMemberList[0] = new TestMember(1, "abc@def.com",
                "1234", "콩벌레", Gender.MALE, 50);
        testMemberList[1] = new TestMember(2, "xxx@zzz.com",
                "9999", "팥죽이", Gender.FEMALE, 30);
        testMemberList[2] = new TestMember(3, "hhh@qwe.com",
                "5678", "카레왕", Gender.FEMALE, 44);
    }

    /**
     * 모든 회원 정보를 출력해 주는 메서드
     */
    void show() {
        System.out.printf("=========== 현재 회원정보 (총 %d명) ===========\n", testMemberList.length);
        for (TestMember testMember : testMemberList) {
            System.out.println(testMember.imform());

        }

    }

    /**
     * 회원 가입 기능
     *
     * @return :  회원가입 성공 여부
     * 성공시 true, 이메일이 중복되어 실패시 false
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
     */
    boolean addMember(TestMember newMember) {

        if (isDuplicateEmail(newMember.email)) return false;

        TestMember[] temp = new TestMember[testMemberList.length + 1];
        for (int i = 0; i < testMemberList.length; i++) {
            temp[i] = testMemberList[i];
        }

        temp[testMemberList.length] = newMember;
        testMemberList = temp;
        temp = null;
        return true;

    }


    /**
     * 이메일의 중복여부를 확인하는 기능
     *
     * @return : 중복되었을 시 true, 사용가능할 시 false
     * @param1 targetEmail : 검사 대상 이메일
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (TestMember testMember : testMemberList) {
            if (testMember.email.equals(targetEmail))
                return true;
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능

    /**
     *
     */
    int getLastMemberId() {
        return testMemberList[testMemberList.length - 1].memberId;
    }

    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null반환
     * @param1 email : 찾고 싶은 회원의 이메일
     */
    TestMember findByEmail(String email) {
        for (TestMember testMember : testMemberList) {
            if (testMember.email.equals(email))
                return testMember;

        }

        return null;
    }

    /**
     * 이메일을 통해 저자된 회원의 인덱스값을 알아내는 메서드
     *
     * @param email 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1리턴
     */

    int findIndexByEmail(String email) {
        for (int i = 0; i < testMemberList.length; i++) {
            if (testMemberList[i].email.equals(email))
                return i;
        }
        return -1;
    }

    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email:      수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */
    boolean changePassword(String email, String newPassword) {
        int index = findIndexByEmail(email);
        if (index == -1) return false;
        testMemberList[index].password = newPassword;
        return true;
    }

    String removeMember(String email) {
        if (findIndexByEmail(email)!= NOT_FOUND) {


            for (int i = findIndexByEmail(email); i < testMemberList.length - 1; i++) {
                testMemberList[i] = testMemberList[i + 1];
            }
            TestMember[] temp = new TestMember[testMemberList.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = testMemberList[i];
            }
            testMemberList = temp;
            temp = null;


            return email;
        } else {
            return null;
        }
    }

}
