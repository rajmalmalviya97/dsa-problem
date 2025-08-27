package InterfacesSmartPhone;

public class SmartPhone implements Camera,MusicPlayer,Phone {
    public void captureImage(){
        System.out.println("capture Image");
    }

    public void soundDecrease(){
        System.out.println("Yes Decrease sound");
    }

    public void soundIncrease(){
        System.out.println("Yes Increase sound");
    }

    public void dialCall(){
       
    }
}
