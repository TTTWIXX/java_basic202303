package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil{



    @Override
    public String touchable() {
        return null;
    }

    @Override
    public void touchDisplay() {

    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String tackPicture() {
        return "1300만 듀얼카메라\n";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화 받기 버튼을 누름\n";
    }

    @Override
    public String information() {
        return makeCall()+takeCall()+tackPicture()+charge()+
                "블루투스 펜 탑재 여부 : "+bluetoothPen();
    }
}
