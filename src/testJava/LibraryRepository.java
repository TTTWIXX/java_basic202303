package testJava;

import day04.array.StringList;

import static testJava.RentedBook.*;

public class LibraryRepository {
    private static BookUser bookUser;

    private static Book[] booklist;

    static {
        booklist = new Book[]{new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    public void register(BookUser userInfo) {
        bookUser = userInfo;
    }

    public BookUser findBookUser() {

        return bookUser;
    }


    // 모든 책의 정보를 알려주는 메서드
    public String[] getBookList() {
        String[] infoList = new String[booklist.length];
        for (int i = 0; i < booklist.length; i++) {
            infoList[i] = booklist[i].info();
        }
        return infoList;
    }

    public String[] searchBookInfoList(String keyword) {
        StringList list = new StringList();
        for (Book book : booklist) {
            if (book.getTitle().contains(keyword)) {
                String info = book.info();
                list.push(info);
            }
        }

        return list.getsArr();
    }

    //도서 대여 처리
    public RentStatus rentBook(int retNum) {
        // 대여를 원하는 책 추출
        Book wishBook = booklist[retNum - 1];

        // 책의 분류에 따라 다른 처리
        if (wishBook instanceof CookBook) {
            CookBook cookBook = (CookBook) wishBook;
            // 쿠폰 유무를 확인
            if (cookBook.isCoupon()) {
                bookUser.setCouponCount(bookUser.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return RENT_SUCCESS;
            }

        } else if (wishBook instanceof CartoonBook) {
            CartoonBook cartoonBook = (CartoonBook) wishBook;
            // 연령제한을 확인
            if (bookUser.getAge() > cartoonBook.getAccessAge()) {
                return RENT_SUCCESS;
            } else {
                return RENT_FAIL;
            }

        }

        return RENT_FAIL;

    }
    //

}
