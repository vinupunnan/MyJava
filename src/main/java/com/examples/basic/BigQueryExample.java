package com.examples.basic;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class BigQueryExample {
    public static void main(String[] args) {
        // Given date-time string
        String dateTimeString = "2024-06-21T12:00:13.161";

        // Parse the date-time string into a LocalDateTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        // Convert LocalDateTime to ZonedDateTime in UTC
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("UTC"));

        // Convert ZonedDateTime to an Instant and then to milliseconds since epoch
        long timestampInMillis = zonedDateTime.toInstant().toEpochMilli();

        // Print the result
        System.out.println("Timestamp in milliseconds: " + timestampInMillis);
    }

}
