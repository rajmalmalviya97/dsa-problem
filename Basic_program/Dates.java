import java.time.LocalDate;
import java.util.Date;

public class Dates {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        LocalDate dateNow = LocalDate.now();

        System.out.println("Date Now "+dateNow);
    }
}
