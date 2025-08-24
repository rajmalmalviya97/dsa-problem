package Test;

public class Car {
   String brand;
   String model;
   String color;
   int manufecture_year;
   int speed;
   int max_speed;

   public void accelerate(int increment){
      speed +=increment;
   }

   public void brake(int drecement){
      speed -=drecement;
   }


}
