package day08.book;

public class CookBook extends Book {
    private boolean coupon; // 요리학원 쿠폰 유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() { //불린타입의 get은 is로
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("# 분류: 요리책, %s, 연력제한: %d세", super.info(), this.coupon ? "있음" : "없음");
    }
}
