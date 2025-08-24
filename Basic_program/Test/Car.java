package Test;

public class Car {
   String brand;
   String model;
   String color;
   private int year;
   int speed;
   int max_speed;

   public int getYear(){
    return year;
   }
   public void setYear(int year){
    this.year = year;
   }

   public void accelerate(int increment){
      speed +=increment;
   }

   public void brake(int drecement){
      speed -=drecement;
   }


}
