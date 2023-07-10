package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormattingTest {

    private static final String DATE = "2023-07-10T00:00:00.000Z";

    private LocalDateTime getLocalDateTime() {
        return LocalDateTime.parse(DATE, DateTimeFormatter.ISO_DATE_TIME);
    }
    
    @Test
    public void test() {
        // Get current date, then format to day of week, and assert output

        Locale locale = new Locale("en_US");
        Temporal certainDate = getLocalDateTime();
        String formatted = DateTimeFormatter.ofPattern("EEEE").withLocale(locale).format(certainDate);
        System.out.println(formatted);
    }

}
