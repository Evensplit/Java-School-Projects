package ch4Ex9;
import java.time.*;

public class TenThousandDaysOld {
    public static void main(String[] args) {
        int month = 01, day = 01, year = 2000;
        
        
        
        LocalDate presentDate = LocalDate.of(year, month, day);
        int DAYS = 10000;
        
        LocalDate futureDate = presentDate.plusDays (DAYS);
        
        System.out.println("I will be 10000 days old on " + futureDate);
        
    }
}

