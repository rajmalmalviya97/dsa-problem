package Test;

public class Test {
   public static void main(String[] args){
     Car car = new Car();
     car.brand = "Mahindra";
     car.color = "Silver";
   //  car.year = 2025;

     car.accelerate(2);
     System.out.println(car.brand);
     System.out.println(car.speed);
    // System.out.println(car.year);
     car.setYear(2026);
     System.out.println(car.getYear());
   } 
}
