package day10.exception_;

public class LoginValidateException extends RuntimeException{


    // 기본 생성자

    public LoginValidateException() {
    }



    // 에러메시지를 받는 생성자
    public LoginValidateException(String messange){
        super(messange);
    }
}
