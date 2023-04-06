package day09.quiz;

public abstract class SmartPhone implements Camera, PhoneCall,Touchable{

    private String model;


    public SmartPhone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract String information();

    public abstract String charge();
    public abstract String touchable();


}
