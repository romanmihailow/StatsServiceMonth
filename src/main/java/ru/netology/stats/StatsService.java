package ru.netology.stats;

public class StatsService {

    //============================================================================================================
    //ОК 1. Сумму всех продаж.
    public int getSummSale(int[] month) {
        //вычисление
        int summSale = 0;
        for (int i = 0; i < month.length; i++) {
            summSale = summSale + month[i];
        }
        //функция возвращает Сумму всех продаж.
        return summSale;
    }

    //============================================================================================================
    //ОК 2. Среднюю сумму продаж в месяц.
    public int getAveregeSaleMonth(int[] month) {
        //вычисление
        int averegeSaleMonth = 0;
        int summSale = 0;
        for (int i = 0; i < month.length; i++) {
            summSale = summSale + month[i];
        }
        averegeSaleMonth = summSale / month.length; // Суммма продаж / количество месяцев=длинна массива
        //функция возвращает Среднюю сумму продаж в месяц.
        return averegeSaleMonth;
    }



    //============================================================================================================
    //ОК 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int getMonthMaxSale(int[] month) {
        //вычисление
        int monthMaxSale = 0;
        for (int i=0; i<month.length;i++){
            if (month[i]>=month[monthMaxSale]){
                monthMaxSale=i;
            }
        }
        return monthMaxSale;
    }



    //============================================================================================================
    //ОК 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    public int getMonthMinSale(int[] month) {
        //вычисление
        int monthMinSale = 0;
        for (int i=0; i<month.length;i++){
            if (month[i]<=month[monthMinSale]){
                monthMinSale=i;
            }
        }
        return monthMinSale;
    }




    //============================================================================================================
    //ОК 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public int getNumOfMonthSaleBelowAverage(int[] month) {
        //вычисление
        int numOfMonthSaleBelowAverage = 0;

        for (int i=0; i<month.length;i++){
            if (month[i]<getAveregeSaleMonth(month)){
                numOfMonthSaleBelowAverage  = numOfMonthSaleBelowAverage + 1;
            }
        }
        return numOfMonthSaleBelowAverage;
    }



    //============================================================================================================
    //ОК 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public int getNumOfMonthSaleAboveAverage(int[] month) {
        //вычисление
        int numOfMonthSaleAboveAverage = 0;

        for (int i=0; i<month.length;i++){
            if (month[i]>getAveregeSaleMonth(month)){
                numOfMonthSaleAboveAverage  = numOfMonthSaleAboveAverage + 1;
            }
        }
        return numOfMonthSaleAboveAverage;
    }








//============================================================================================================
//
//
//    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
//    public int numberMonthMaxSale() {
//        //вычисление
//        int monthMax = 0;
//        int numberMonthMaxSale = 0;
//
//
//        //функция возвращает
//        return numberMonthMaxSale;
//    }
//
//
//    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
//    public int numberMonthMinSale() {
//        //вычисление
//        int numberMonthMinSale = 0;
//
//
//        //функция возвращает
//        return numberMonthMinSale;
//    }
//
//
//    // Количество месяцев, в которых продажи были ниже среднего (см. п.2).
//    public int quantityMonthSaleDownAverege() {
//        //вычисление
//        int quantityMonthSaleMinAverege = 0;
//
//
//        //функция возвращает
//        return quantityMonthSaleMinAverege;
//    }
//
//
//    // Количество месяцев, в которых продажи были выше среднего (см. п.2).
//    public int quantityMonthSaleUpAverege() {
//        //вычисление
//        int quantityMonthSaleUpAverege = 0;
//
//
//        //функция возвращает
//        return quantityMonthSaleUpAverege;
//    }

}
