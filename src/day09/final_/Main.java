package day09.final_;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수",
                "000111-31231234",
                // final: 처음 한번은 들어간다.
                // "대한민국",
                new BagPack(5, "샘소나이트")
        );


        kim.name="김출수";
        // kim.ssn="021111-2222222";

    }
}
