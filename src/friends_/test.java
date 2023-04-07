package friends_;

public class test {
    public static void main(String[] args) {

//
//        People kim = new People("김철수");
//        People park = new People("박영희");
//        People hong = new People("홍길동");
//
//        kim.addFollowerWaitList(park);
//        kim.addFollowerWaitList(hong);
//
//        kim.addFollower(park);
//
//        park.addFollowerWaitList(kim);
//        park.addFollower(kim);
//        park.addFollower(hong);
//
//        park.addFavorites("홍길동");
//        park.removeFollower("김철수");
//
//        List<String> kimwaitList = kim.showFollowerWaitPerson();
//        System.out.println("kimwaitList = " + kimwaitList);
//        List<String> followerNames = kim.showFollower();
//        System.out.println("followerNames = " + followerNames);
        People kim = new People("킴킴");
        People park = new People("박영희");
        People hong = new People("홍길동");

        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);

        kim.addFollower(park);
        kim.addFollower(hong);


        kim.addFavorites("박영희");
        kim.addFavorites("홍길동");
        System.out.println(kim);





    }
}
