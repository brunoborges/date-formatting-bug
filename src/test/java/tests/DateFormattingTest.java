package tests;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormattingTest {
    
    @Test
    public void test() {
        // Get current date, then format to day of week, and assert output

        Locale locale = new Locale("en_US");
        ZonedDateTime now = ZonedDateTime.now();
        String expected = "Today is " + now.getDayOfWeek().toString();
        System.out.println(expected);

        String formatted = DateTimeFormatter.ofPattern("EEEE").withLocale(locale).format(now);
        System.out.println(formatted);
    }

}
