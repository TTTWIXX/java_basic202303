package testMember.member;

// 역할: 회원 저장소 역할
public class MemberRepository {
    public static final int NOT_FOUND = -1;
//    상수화

    Member[] memberList;
    Member[] removeMembers;

    public MemberRepository() {


    }

    /**
     * 모든 회원 정보를 출력해주는 메서드
     */

    /**
     * 회원 가입 기능
     *
     * @return :  회원가입 성공 여부
     * 성공시 true, 이메일이 중복되어 실패시 false
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
     */


    /**
     * 이메일의 중복여부를 확인하는 기능
     *
     * @param targetEmail
     * @return : 중복되었을 시 true, 사용가능할 시 false
     * @param1 targetEmail : 검사 대상 이메일
     */
    public boolean isDuplicate(String targetEmail) {
        for (Member member : memberList) {
            if(member.email.equals(targetEmail))
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


    /**
     * 이메일을 통해 저자된 회원의 인덱스값을 알아내는 메서드
     * @param email 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1리턴
     */


    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email: 수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */


    }


