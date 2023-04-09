package testBook;


import day04.array.StringList;
import day08.book.CartoonBook;
import day08.book.CookBook;

public class LibraryRepository {
    // 회원 1명
    private static BookUser bookUser;

    // 도서들의 정보
    private static Book[] bookList;

    //static initializer
    static {
        //Book 배열이다
        bookList = new Book[]{
                new testBook.CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new testBook.CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new testBook.CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new testBook.CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new testBook.CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new testBook.CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    // 유저를 등록하는 기능
    void register(BookUser userInfo) {

        bookUser = userInfo;

    }


    // 마이페이지 기능
    public BookUser bookUserInfo() {
        return bookUser;
    }
    /*
        여기에 있는 bookUser 정보 리턴
     */
//    BookUser findBookUser() {
//
//    }

    //     모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList() {
       String[] list=new String[bookList.length];
        for (int i = 0; i < bookList.length; i++) {
            list[i]=bookList[i].info();
        }
        return list;
    }

    // 검색어를 받으면 해당 검색어를 포함하는 제목을 가진
    // 책 정보들을 반환
//    public String searchBookByAuthor(String author) {
//
//    }


    public String[] searchBookInfoList(String keyword) {

        return null;
    }

//    public RentStatus rentBook(int rentNum) {
//        // 대여를 원하는 책 추출
//
//
//        // 책의 분류에 따라 다른 처리
//
//            // downcasting 해야한다.
//
//            // 쿠폰 유무 확인
//
//
//            // 연령제한을 확인
//
//            // 빌릴 수 있는 경우
//
//
//
//    }


}
