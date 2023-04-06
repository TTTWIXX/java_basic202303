package day09.abs;

public class Dog extends Pet{

    private String name; // 이름
    private  String kind; // 종
    private  int age; // 나이

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat(){
        System.out.println("강아지는 사료를 먹어요~");
    }

    @Override
    public void takeNap(){
        System.out.println("강아지는 마당에서 낮잠을 자요~");
    }
}
