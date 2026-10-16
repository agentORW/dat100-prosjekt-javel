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

        // b)
        System.out.println("Print power usage");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // c)
        System.out.println("Compute power usage");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));

        // d)
        System.out.println("Compute spot price");
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));

        // e) private method, cant test

        // f)
        System.out.println("Compute power support");
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));

        // g)
        System.out.println("Compute Norgespris");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));

        // h)
        System.out.println("Find peak power usage");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));

        // i)
        System.out.println("Find average power usage");
        System.out.println(DailyPower.findAvgPower(powerusage_day));

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to test the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
