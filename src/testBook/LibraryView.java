package testBook;

import day05.member.Gender;

import static day05.member.Gender.FEMALE;
import static day05.member.Gender.MALE;
import static day07.newutli.Utility.input;

public class LibraryView {
    //private static Scanner sc;
    private static final LibraryRepository repository;

    //static 데이터는 생성자에서 초기화하면 안됨.
    //static 필드의 초기화는 static initializer를 사용
    static {
        // sc=new Scanner(System.in);
        repository = new LibraryRepository();
    }

    // 회원정보 입력처리
    private static void makeNewBookUser() {
        System.out.println("# 회원 정보를 입력해주세요.");
        String name = input("# 이름 : ");
        int age = Integer.parseInt(input("# 나이 : "));
        Gender gender = inputGender();
        // 드레그후 ctrl+alt+m : 함수로 추출


        // 입력받은 데이터를 객체화
        BookUser user = new BookUser();
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);

        // 입력받은 유저객체를 저장소로 보내기
        repository.register(user);


    }

    // 정확하게 성별을 입력할때까지 반복 입력받는 메서드
    private static Gender inputGender() {
        Gender gender;
        while (true) {
            String convertGender = input("# 성별(M/F) : ");

            switch (convertGender.toUpperCase().charAt(0)) {
                case 'F':

                    return gender = FEMALE;
                case 'M':
                    return gender = MALE;
                default:
                    System.out.println("성별을 다시 입력해주세요!");
            }
        }
    }


    //화면 처리
    public static void start() {

        // 메인 메뉴 뛰우기
        makeNewBookUser();
        showMainScreen();
        selectMenu();


    }


    // 메뉴 번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input("-메뉴 번호: ");
        switch (menuNum) {
            case "1":
                //마이페이지 : 가입한 회원정보 출력

                System.out.println("\n**********회원님 정보**********");
                BookUser user = repository.bookUserInfo();
                System.out.println("# 회원명 : " + user.getName());
                System.out.println("# 나이 : " + user.getAge());
                System.out.println("# 성별 : " + user.getGenderToString());
                System.out.println("# 쿠폰개수 : " + user.getCouponCount());

                break;
            case "2":
                String[] list = repository.getBookInfoList();
                System.out.println("\n=============모든 도서 정보=============");
                for (String info : list) {
                    System.out.println(info);
                }

                break;
            case "3":
                // 사용자에게 검색어를 입력받는다.
                String keyword = input("# 검색어: ");

                // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 요구


                System.out.printf("=========[%s] 검색 결과 =========\n", keyword);


                break;
            case "4":
                // 대여가능한 책의 목록을 번호화 함께 출력

                System.out.println("\n=============모든 도서 정보=============");
                repository.getBookInfoList();
                break;
            case "5":
                // 사용자에게 제목을 입력받는다.


                // 저장소에게 해당 제목을 주면서 검색에 걸린 책 정보를 요구
//                String findBook = repository.searchBookByAuthor(titleWord);


                break;
            case "9":

                break;
            default:
                System.out.println("메뉴번호를 다시 입력하시오");
        }
    }


    // 메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {

        System.out.println("============도서 메뉴============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기"); // 만화책 나이제한,요리책 coupon 있으면 카운트 업
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료");

    }


}
