package InterfacesSmartPhone;

public interface Phone {
    public void dialCall();

 public default void dialNumber(int number){
        System.out.println("Dial Call on "+number);
    }
    
} 
