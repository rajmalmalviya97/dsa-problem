package Test;

public class Test {
   public static void main(String[] args){
     Car car = new Car();
     car.brand = "Mahindra";
     car.color = "Silver";

     car.accelerate(2);
     System.out.println(car.brand);
     System.out.println(car.speed);
   } 
}
