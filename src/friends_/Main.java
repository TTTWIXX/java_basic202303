package friends_;

public class Main {
    public static void main(String[] args) {

        People kim = new People("김철수");
        People park = new People("박영희");
        People hong = new People("홍길동");

        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);

        kim.addFollower(park);

        park.addFollowerWaitList(kim);
        park.addFollower(kim);







    }
}
