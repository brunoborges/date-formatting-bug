package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormattingTest {

    private static final String DATE = "2023-07-10T00:00:00.000Z";

    private LocalDateTime getLocalDateTime() {
        return LocalDateTime.parse(DATE, DateTimeFormatter.ISO_DATE_TIME);
    }

    private String format(String pattern) {
        Locale locale = new Locale("en_US");
        Temporal certainDate = getLocalDateTime();
        return DateTimeFormatter.ofPattern(pattern).withLocale(locale).format(certainDate);
    }

    @Test
    public void testDayOfWeek() {
        String formatted = format("EEEE");
        String expected = "Monday";
        Assertions.assertEquals(expected, formatted);
    }

    @Test
    public void testMonth() {
        String formatted = format("MMMM");
        String expected = "July";
        Assertions.assertEquals(expected, formatted);
    }

}
