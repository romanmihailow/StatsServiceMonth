package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldSummSale() {

        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSummSale = 180;
        int actualSummSale = service.getSummSale(month);

        Assertions.assertEquals(expectedSummSale, actualSummSale);

    }

    @Test

    public void shouldAveregeSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAveregeSaleMonth = 15;
        int actualAvergeSaleMonth = service.getAveregeSaleMonth(month);

        Assertions.assertEquals(expectedAveregeSaleMonth, actualAvergeSaleMonth);

    }


    @Test
    public void shouldMonthMaxSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMaxSale = 8;
        int actualMonthMaxSale = service.getMonthMaxSale(month) + 1;

        Assertions.assertEquals(expectedMonthMaxSale, actualMonthMaxSale);
    }


    @Test
    public void shouldMonthMinSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMinSale = 9;
        int actualMonthMinSale = service.getMonthMinSale(month) + 1;

        Assertions.assertEquals(expectedMonthMinSale, actualMonthMinSale);
    }


    @Test
    public void shouldNumOfMonthSaleBelowAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumOfMonthSaleBelowAverage = 5;
        int actualNumOfMonthSaleBelowAverage = service.getNumOfMonthSaleBelowAverage(month);

        Assertions.assertEquals(expectedNumOfMonthSaleBelowAverage, actualNumOfMonthSaleBelowAverage);
    }


    @Test
    public void shouldNumOfMonthSaleAboveAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumOfMonthSaleAboveAverage = 5;
        int actualNumOfMonthSaleAboveAverage = service.getNumOfMonthSaleAboveAverage(month);

        Assertions.assertEquals(expectedNumOfMonthSaleAboveAverage, actualNumOfMonthSaleAboveAverage);
    }


}
