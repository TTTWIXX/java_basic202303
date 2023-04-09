package testMember.member;


// 역할: 회원 저장소 역할
public class MemberRepository {
    public static final int NOT_FOUND = -1;
//    상수화

    Member[] memberList;
    Member[] removeMembers;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member(1, "abc@def.com",
                "1234", "콩벌레",
                Gender.MALE, 50);
        memberList[1] = new Member(2, "xxx@zzz.com",
                "9999", "팥죽이",
                Gender.FEMALE, 30);
        memberList[2] = new Member(3, "hhh@qwe.com",
                "5678", "카레왕",
                Gender.FEMALE, 44);


    }

    /**
     * 모든 회원 정보를 출력해주는 메서드
     */
    public void showMembers() {
        String gender;
        for (Member member : memberList) {
            if (member.gender == Gender.FEMALE) {
                gender = "남성";
            } else {
                gender = "여성";
            }
            System.out.printf("# %d번 | %s | %s | %s | %d세\n",
                    member.memberId, member.email, member.memberName, gender, member.age);
        }

    }

    /**
     * 회원 가입 기능
     *
     * @return :  회원가입 성공 여부
     * 성공시 true, 이메일이 중복되어 실패시 false
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
     */
    public boolean addMemberList(Member member) {
        if (isDuplicate(member.email))
            return false;
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = member;
        memberList = temp;
        temp = null;

        return true;

    }


    /**
     * 이메일의 중복여부를 확인하는 기능
     *
     * @param : targetEmail
     * @return : 중복되었을 시 true, 사용가능할 시 false
     * @param1 targetEmail : 검사 대상 이메일
     */
    public boolean isDuplicate(String targetEmail) {
        for (Member member : memberList) {
            if (member.email.equals(targetEmail))
                return true;
        }
        return false;
    }


    // 마지막 회원의 번호를 알려주는 기능


    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null반환
     * @param1 email : 찾고 싶은 회원의 이메일
     */
    public Member findUser(String email) {
        for (Member member : memberList) {
            if (member.email.equals(email))
                return member;
        }
        return null;


    }


    /**
     * 이메일을 통해 저자된 회원의 인덱스값을 알아내는 메서드
     *
     * @param email 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1리턴
     */
    public int findIndex(String email) {
        int index = -1;
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email))
                index = i;
        }

        return index;
    }


    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email:      수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */

    public void changePassword(String email, String newPassword) {
        Member user = findUser(email);

        if (user.password.equals(newPassword)) {
            System.out.println("같은 비밀번호입니다.");
        } else {
            user.password = newPassword;
            System.out.println("비밀번호가 변경되었습니다.");
        }
    }

}


