package day08.book;

import day05.member.Gender;

import static day05.member.Gender.*;
import static day07.newutli.Utility.*;

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

        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름:");
        int age = Integer.parseInt(input("# 나이:"));

        // 드레그후 ctrl+alt+m : 함수로 추출
        Gender gender = inputGender();

        // 입력받은 데이터를 객체화
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        // 입력받은 유저객체를 저장소로 보내기
        repository.register(userInfo);

    }

    // 정확하게 성별을 입력할때까지 반복 입력받는 메서드
    private static Gender inputGender() {

        while (true) {
            String inputGender = input("# 성별(M/F):");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    return MALE;
                case 'F':
                    return FEMALE;
                default:
                    System.out.println("\n# 성별을 잘못 입력했습니다.");
            }
        }
        //드레그후 ctrl+alt+t 3번: while로 감싸기
    }


    //화면 처리
    public static void start() {
        makeNewBookUser();

        // 메인 메뉴 뛰우기
        while (true) {
            showMainScreen();
            selectMenu();


        }


    }


    // 메뉴 번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input("-메뉴 번호: ");
        switch (menuNum) {
            case "1":
                //마이페이지 : 가입한 회원정보 출력
                BookUser user = repository.findBookUser();
                System.out.println("\n**********회원님 정보**********");
                System.out.println("# 회원명:" + user.getName());
                System.out.println("# 나이:" + user.getAge());
                System.out.println("# 성별:" + user.getGender());
                System.out.println("# 쿠본개수:" + user.getCouponCount());
                break;
            case "2":
                String[] infoList = repository.getBookInfoList();
                System.out.println("\n=============모든 도서 정보=============");
                for (String info : infoList) {
                    System.out.println(info);
                }
                break;
            case "3":
                // 사용자에게 검색어를 입력받는다.
                String keyword = input("# 검색어: ");

                // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 요구

                String[] bookInfoList = repository.getBookInfoList();
                if (bookInfoList.length > 0) {
                    System.out.printf("=========[%s] 검색 결과 =========\n", keyword);
                    for (String info : bookInfoList) {
                        System.out.println(info);
                    }
                } else {
                    System.out.println("\n# 검색 결과가 없습니다.");
                }

                break;
            case "4":
                // 대여가능한 책의 목록을 번호화 함께 출력
                String[] rentalList = repository.getBookInfoList();
                System.out.println("\n=============모든 도서 정보=============");
                int bookNum = 1;
                for (String info : rentalList) {
                    System.out.printf("%d. %s\n", bookNum, info);
                }
                String rentNUM = input("- 대여할 도서 번호 입력 : ");
                RentStatus rentStatus = repository.rentBook(Integer.parseInt(rentNUM));
                if(rentStatus==RentStatus.RENT_SUCCESS_WITH_COUPON){
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                }else if(rentStatus==RentStatus.RENT_SUCCESS){
                    System.out.println("# 도서가 성공적으로 대야되었습니다.");
                }else{
                    System.out.println("# 도서 대여에 실패했습니다.");
                }
                break;
            case "5":
                // 사용자에게 제목을 입력받는다.
                String titleWord = input("# 제목: ");

                // 저장소에게 해당 제목을 주면서 검색에 걸린 책 정보를 요구
                String findBook = repository.searchBookByAuthor(titleWord);
                if (findBook != null)
                    System.out.println("책정보: " + findBook);

                break;
            case "9":
                System.out.println("# 프로그램을 종효합니다.");
                System.exit(0);
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
