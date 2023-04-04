package day07.inherit;

public class Warrior extends Player{
     //extends를 is a 로 바꿔서 말이 되면 된다.

    int rage; // 분노게이지

    public Warrior(String nickName){
        super(nickName); //숨겨져 있음
        // this()와 super()는 같이 사용 x
        this.rage=20;
    }


    // 파워슬래시
    public void powerSlash(){
        System.out.println("파워 슬래시를 시전합니다.");
    }
    // 오버라이딩
    // 조건 : 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    //        접근제한자는 무조건 부모보다 public해야 함.
    //        시그니쳐가 같아야한다. (함수명, 매개변수 , 리턴타입)
    @Override // 오버라이딩 검사
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage = " + this.rage);

    }

}
