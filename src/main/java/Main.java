import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //int[] arr = new int[12];
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };


        StatsService service = new StatsService();
        int summSale = service.getSummSale(month);
        int averegeSaleMonth = service.getAveregeSaleMonth(month);
        int monthMaxSale = service.getMonthMaxSale(month) + 1;
        int monthMinSale = service.getMonthMinSale(month) + 1;
        int numOfMonthSaleBelowAverage = service.getNumOfMonthSaleBelowAverage(month);
        int numOfMonthSaleAboveAverage = service.getNumOfMonthSaleAboveAverage(month);


        //arr[3] = 11;
        //System.out.println(Arrays.toString(month));
        //System.out.println(arr[4]); // ответ 0

        System.out.println("1. Сумма всех продаж: " + summSale);
        System.out.println("2. Средняя сумма продаж в месяц:  " + averegeSaleMonth);
        System.out.println("3. Номер месяца, в котором был пик продаж:   " + monthMaxSale);
        System.out.println("4. Номер месяца, в котором был минимум продаж:   " + monthMinSale);
        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего:   " + numOfMonthSaleBelowAverage);
        System.out.println("6. Количество месяцев, в которых продажи были выше среднего:   " + numOfMonthSaleAboveAverage);
    }
}
