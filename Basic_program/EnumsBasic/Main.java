package EnumsBasic;

public class Main {
    public static void main(String[] args) {
        System.out.println(Days.WEDNESDAY);

        Days day = Days.MONDAY;
         System.out.println(day.ordinal());
        System.out.println(day.name());
        day.display();

       // System.out.println(Days.valueOf("SUNDAY ada"));
    }
}
