package day10.generic;

public class Main {
    public static void main(String[] args) {
        AppleBasket ab=new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());

        Basket<Apple> apples=new Basket();
        apples.setFruit(new Apple());
        //apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();
        Basket<Banana> bananas = new Basket<>();
        //bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());





    }
}
