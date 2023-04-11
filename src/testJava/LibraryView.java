package testJava;


import java.util.Arrays;

import static day07.newutli.Utility.input;
import static testJava.RentStatus.*;


public class LibraryView {

    private static LibraryRepository repository;

    static {
        repository = new LibraryRepository();
    }

    //회원정보 입력처리
    public static void inputInfo() {
        System.out.println("# 회원 정보를 입력해주세요.");
        String name = input("이름 : ");
        int age = Integer.parseInt(input("나이 : "));
        Gender gender = getGenderInput();


        BookUser bookUser = new BookUser();
        bookUser.setName(name);
        bookUser.setAge(age);
        bookUser.setGender(gender);

        repository.register(bookUser);


    }

    private static Gender getGenderInput() {

        while (true) {
            String genderInput = input("성별(M/F) : ");
            Gender gender = null;
            switch (genderInput.toUpperCase().charAt(0)) {
                case 'M':
                    return Gender.MALE;
                case 'F':
                    return Gender.FEMALE;

            }

        }

    }


    public static void start() {
        inputInfo();


        while (true) {
            showMainScreen();
            selectMenu();
        }


    }

    private static void showMainScreen() {

        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    private static void selectMenu() {
        String menuNum = input("-메뉴 번호 :");
        switch (menuNum) {
            case "1":
                //회원정보 출력
                BookUser user = repository.findBookUser();
                System.out.println("\n******** 회원님 정보 ********");
                System.out.println("# 회원명: " + user.getName());
                System.out.println("# 나이: " + user.getAge());
                System.out.println("# 성별: " + user.getGenderToString());
                System.out.println("# 쿠폰개수: " + user.getCouponCount());
                break;
            case "2":
                System.out.println("\n============ 모든 도서 정보 ===========");
                String[] infoList = repository.getBookList();
                for (String bookInfo : infoList) {
                    System.out.printf(bookInfo);
                }
                break;
            case "3":
                //사용자에게 검색어를 입력받는다.
                String keyword = input("# 검색어 : ");
                // 저장소에게 해당 검색어를 주면서 검색에
                // 걸린 책 정보를 내노라고 해야함
                String[] bookInfoList = repository.searchBookInfoList(keyword);
                System.out.printf(Arrays.toString(bookInfoList));
                break;
            case "4":
                System.out.println("============ 대여가능한 도서 정보 ===========");
                int bookNum=1;
                for (String bookList : repository.getBookList()) {
                    System.out.println(bookNum+bookList);
                    bookNum++;
                }
                int borrowBookNum = Integer.parseInt(input("-대여할 도서 번호 입력"));
                RentStatus rentStatus=repository.rentBook(borrowBookNum);
                if(rentStatus== RENT_SUCCESS_WITH_COUPON){
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                }else if(rentStatus== RENT_SUCCESS){
                    System.out.println("# 도서가 성공적으로 대여 되었습니다.");
                }else{
                    System.out.println("# 도서 대여에 실패했습니다.");
                }
                break;
                RentStatus rentResult = repository.rentBook(borrowBookNum);
                switch (rentResult) {
                    case RENT_SUCCESS_WITH_COUPON:
                        System.out.println("쿠폰과 함께 구매가 완료되었습니다");
                        break;
                    case RENT_SUCCESS:
                        System.out.println("구매가 완료되었습니다.");
                        break;
                    case RENT_FAIL:
                        System.out.println("구매에 실패하였습니다.");
                }

            case "5":
            case "9":
            default:
                System.out.println("\n# 메뉴번호를 똑바로 입력하시오!");
        }
    }

    ;


}
