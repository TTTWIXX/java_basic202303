package friends_;

import java.util.ArrayList;
import java.util.List;

public class People {

    //닉네임
    private String nickName;

    // 팔로워 목록
    private List<People> followers;

    //팔로워 대기목록
    private List<People> followerWaitList;

    // 팔로잉 목록
    private List<People> followings;

    // 즐겨찾기 목록
    private List<People> favoritesList;


    //생성자

    public People(String nickName) {
        this.nickName = nickName;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.followerWaitList = new ArrayList<>();
        this.favoritesList = new ArrayList<>();
    }

    // 팔로워 대기목록에 팔로우 요청한 사람을 추가하는 기능
    public void addFollowerWaitList(People requestPerson) {
        this.followerWaitList.add(requestPerson);
    }

    // 팔로워 목록에 팔로우 수락한 사람을 추가하는 기능
    public void addFollower(People requestPerson) {
        // 내 팔러워 목록에 상대방추가
        this.followers.add(requestPerson);
        // 내 팔로워 대기목록에서 상대방 삭제
        this.followerWaitList.remove(requestPerson);
        // 상대방의 팔로잉 몰록에 나 추가
        requestPerson.followers.add(this);
    }

    // 팔로워 대기목록에서 닉네임들을 보여주는 기능
    public List<String> showFollowerWaitPerson() {
        // 팔로워대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListNames = new ArrayList<>();
        for (People people : followerWaitList) {
            waitListNames.add(people.nickName);
        }
        return waitListNames;
    }

    // 팔로워 목록에서 닉네임들을 보여주는 기능
    public List<String> showFollower() {
        // 팔로워대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListNames = new ArrayList<>();
        for (People people : followers) {
            waitListNames.add(people.nickName);
        }
        return waitListNames;
    }

    //닉네임을 입력하여 자신의 팔로워를 언팔하는 기능
    public void removeFollower(String nickName) {
        if (showFollower().contains(nickName)) {
            followers.remove(nickName);
            System.out.printf("%s님이 삭제 되었습니다.\n", nickName);
            System.out.println(followers);
        } else {
            System.out.printf("%s님이 존재하지 않습니다.\n", nickName);
        }
    }


    // 자신의 팔로워인지 알려주는 기능

    /**
     * @return nickName이 나의 팔로워 이면 true를 리턴한다.
     * @parm nickname
     */
    public boolean findFollower(String nickName) {

        return showFollower().contains(nickName);

    }

    // 닉네임을 입력받아 People 객체를 리턴하는 기능
    public People getPeopleObject(String nickName) {
        if (findFollower(nickName)) {
            for (People following : followings) {
                if (following.nickName.equals(nickName)) {
                    return following;
                }
            }
        }
        return null;
    }

    // 자신의 팔로워중 즐겨찾는 사람의 닉네임을 입력하여
    // 해당되는 객체를 즐겨찾기 배열로 옮기는 함수
    public List<People> addFavorites(String nickName) {
        favoritesList = new ArrayList<>();

        // 나의 팔로워 목록에서 해당 닉네임을 가진 객체를 찾는다.
        for (People follower : followers) {
            // 찾게되면 해당 객체를 foavritesList에 추가한다.
            if (follower.nickName.equals(nickName)) {
                favoritesList.add(follower);
            } else {
                System.out.printf("%s의 닉네임이 존재하지 않습니다.\n", nickName);
            }
        }
        return favoritesList;
    }


}