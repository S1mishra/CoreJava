package JavaTimeAPI;

import java.time.LocalDate;

public class ExploreLocalDate {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1.minusWeeks(1);
        d1=null;
        LocalDate d3 = LocalDate.now().plusYears(3).minusMonths(4);
        d2.plusWeeks(5);
        d1 = d2;
        System.out.println(d1.toString());
    }
}
