package day09.quiz;

public class Iphone extends SmartPhone {

    @Override
    public String touchable() {

        return null;
    }

    @Override
    public void touchDisplay() {

    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선충전\n";
    }

    @Override
    public String tackPicture() {
        return "1200만, 1600만 트리플 카메라\n";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름\n";
    }

    @Override
    public String information() {
        return makeCall() + takeCall() + tackPicture() + charge();
    }
}
