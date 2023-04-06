package day09.abs;
// 추상화
// 1. 객체 생성 불가
// 2. 메서드는 오버라이딩을 위한 껍데기역할에 국한되도록 제한, 강제 오버라이딩을 강요!
// 3. 클래스가 abstract가아니면 메서드에 abstract 선언 X
// 4. abstarct클래스에서 일반 메서드는 만들수 있다.
// abstract는 무조건 해야하는 기능!
public abstract class Pet {
    private String name; // 이름
    private  String kind; // 종
    private  int age; // 나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }
    //오버라이딩을 위한 메서드
    public abstract void takeNap();

    public abstract void eat();
}
