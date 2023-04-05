package day08.book;

public class Book {
    private String title; // 도서명
    private String author; // 저자명
    private String publisher; // 출판사명

    // 대여상태


    public Book() {
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // 책 정보 문자열 생성
    // 글자가 길면 백엔드에서 짤라줘야한다.
    // web에서는 보여주기만하면된다.
    public String info() {
        //문자열 글자수 얻기 length()
        int length = this.title.length();
        String prettier;
        if (length > 8) {
            //문자열 슬라이스 subString()
            prettier = this.title.substring(0, 8) + "...";
        } else {
            prettier = this.title;
        }
        return String.format("제목: %s", prettier);
    }



}
