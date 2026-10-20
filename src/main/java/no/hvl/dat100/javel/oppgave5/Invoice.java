package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = prices;
        this.amount = 0;
    }

    public void computeAmount() {

        switch (this.c.getAgreement()) {
            case PowerAgreementType.NORGESPRICE:
                this.amount = MonthlyPower.computeNorgesPrice(usage);
                break;
            case PowerAgreementType.POWERSUPPORT:
                this.amount = MonthlyPower.computeSpotPrice(usage, prices)- MonthlyPower.computePowerSupport(usage, prices);
                break;
            case PowerAgreementType.SPOTPRICE:
                this.amount = MonthlyPower.computeSpotPrice(usage, prices);
                break;
        }

    }

    public void printInvoice() {

        System.out.println(this.c);

        System.out.println("Month: " + this.month);
        System.out.printf("Usage: \t %.2f kWh\n", MonthlyPower.computePowerUsage(this.usage));
        System.out.printf("Amount: \t %.2f NOK\n", this.amount);

    }
}
