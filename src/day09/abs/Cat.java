package day09.abs;

public class Cat extends Pet{
    private String name;
    private String kind;
    private int age;

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void eat(){
        System.out.println("고양이가 사료를 먹어요~");
    }
    @Override
    public void takeNap(){
        System.out.println("고양이가 캣타워에서 잠을 자요");
    }
}
