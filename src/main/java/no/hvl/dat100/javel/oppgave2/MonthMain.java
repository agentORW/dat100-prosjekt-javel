package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Power usage:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        System.out.println("Power prices:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        System.out.println("Total monthly power usage:");
        System.out.printf("%.2f kWh", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println();
        System.out.println();

        System.out.println("Exceeded monthly usage threshold for cabin: " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("Exceeded monthly usage threshold for house: " + MonthlyPower.exceedThreshold(power_usage_month, 5000));
        System.out.println();

        System.out.println("Monthly spotprice: ");
        System.out.printf("%.2f NOK", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
    }
}