package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // a)
        System.out.println("Print power prices");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println();

        // b)
        System.out.println("Print power usage");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println();

        // c)
        System.out.println("Compute power usage");
        System.out.printf("%.2f kWh\n", DailyPower.computePowerUsage(powerusage_day));
        System.out.println();

        // d)
        System.out.println("Compute spot price");
        System.out.printf("%.2f NOK\n", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println();

        // e) private method, cant test

        // f)
        System.out.println("Compute power support");
        System.out.printf("%.2f NOK\n", DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println();

        // g)
        System.out.println("Compute Norgespris");
        System.out.printf("%.2f NOK\n", DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println();

        // h)
        System.out.println("Find peak power usage");
        System.out.printf("%.2f kWh\n", DailyPower.findPeakUsage(powerusage_day));
        System.out.println();

        // i)
        System.out.println("Find average power usage");
        System.out.printf("%.2f kWh\n", DailyPower.findAvgPower(powerusage_day));
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to test the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
