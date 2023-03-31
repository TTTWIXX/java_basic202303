package day05.player;

public class Player {

    //필드
    String nickName; // 캐릭터 닉네임
    int level;
    int hp;

    // 생성자

    public Player() {
        System.out.println("1번 생성자 호출!");
//        this(nickName: "이름없음");
//        this.nickName = "이름없음";
//        this.level = 1;
//        this.hp = 50;

    }
    public  Player(String nickName){
        this(nickName,1,50);
        System.out.println("2번 생성자 호출");
    };



//    public Player(String nickName) {
//        System.out.println("2번 생성자 호출!");
//        this.nickName = nickName;
//        // 너가 준 nickName을 나의 nickName으로 할께
//        // 생성자의 this
//        this.level = 1;
//        this.hp = 50;
//    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    // 기능 - 메서드
    void levelUp(Player this){
//        원래는 매개변수에 Player this 가 생략되어있다.
    }
    void attack(Player this,Player target) {
        if(this==target) return;
        // 내가 날 못때리게 한다! this 나! 함수의 주체!

        System.out.println("target의 주소:"+target);
        //맞은녀석의 체력을 10~15감소시킬거임
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;

        //전투로그를 출력할거임
        // "가해자가 피해자를 공격해서 xxx의 피해를 입힘"
        System.out.printf("%s님이 $s님을 공격해어 %d의 피해르 입힘!\n",
                this.nickName, target.nickName, damage);
                // this 나라고 생각 (this is speaking!)
                // this 의 type은 player이다



    }

}
