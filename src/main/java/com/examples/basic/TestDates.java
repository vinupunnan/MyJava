package com.examples.basic;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.lastInMonth;
import static java.time.DayOfWeek.THURSDAY;

public class TestDates {
    public static void main(String[] args){
        int year = LocalDate.now().getYear();
      int month = LocalDate.now().getMonthValue();
        System.out.println("Year" +year);
        System.out.println("month" +month);

        LocalDate lastThursday = LocalDate.of(year, month, 1).with(lastInMonth(THURSDAY));
    System.out.println(lastThursday);

        TemporalAdjuster temporalAdjuster = t -> t.minus(Period.ofDays(9));
        LocalDate result = lastThursday.with(temporalAdjuster);
        System.out.println("Lst Tuesday" +result);

    }
}
