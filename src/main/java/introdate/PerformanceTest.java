package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance transPerformance = new Performance(LocalDate.of(2020, 11, 19), "Lagzi Lajcsi band", LocalTime.of(12, 00), LocalTime.of(22, 00));

        System.out.println(transPerformance.getInfo());

    }
}
