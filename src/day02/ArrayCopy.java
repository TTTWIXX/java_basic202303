package day02;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 복사 알고리즘
//        String[] pets = new String[] {"멍멍이","야옹이","짹짹이"};



        // 선언과 동시에 초기화한다면 new Type[]생략가능
        // 일반적인 상황에서는 new ~~~ 붙여야된다.
        String[] pets = {"멍멍이","야옹이","짹짹이"};
//      String[] petsCopy=pets;
//        System.out.println("원본주소: "+pets);
//        System.out.println("사본주소: "+petsCopy);
        //이건 배열의 주소를 복사한것이다.

        pets[1]="사마귀";


//        System.out.println("pets = " + Arrays.toString(pets));
//        System.out.println("petsCopy = " + Arrays.toString(petsCopy));

        //1. 원본가 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        //2. 원본의 각 인덱스값을들 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            pets[i]=petsCopy[i];
        }

        System.out.println("원본주소: "+pets);
        System.out.println("사본주소: "+petsCopy);
        // 주소가 다름







    }


}
