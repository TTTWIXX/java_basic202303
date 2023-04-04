package day07.static_;

public class Count {
    // 제한자(modifier)
    // 접근 제한자(Access), 사용 제한자(Usage)
    public static int x; // 정적 필드 : 모든 객체가 공유
    public int y;       // 인스턴스 필드 : 객체별로 관리

    // 정적 메서드
    public static void m1() {
        System.out.println("static메서드 호출!");
        // 필드 참조(static메서드 안에서는 static필드만 참조가능)

        System.out.println("x = " + x);
        // System.out.println("y = " + this.y);  어떤 y인지 알수가없다. 클래스.m1으로 불러오기때문에
        // static은 this정보를 알수가 없어서 호출 불가능
        // this를 알게하면 된다.
        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
    }

    //인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = " + x);
        System.out.println("y = " + this.y);
        //어떤 y인지 알수가 있다. 객체.m1으로 불러오기때문에
    }

}
