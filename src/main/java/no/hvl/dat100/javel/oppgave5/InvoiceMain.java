package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("Caroline Jones", "caroline.jones@pinkplace.com", 1, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("Cat", "cat@pinkplace.com", 60, PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("Mother", "mother.jones@pinkplace.com", 25, PowerAgreementType.POWERSUPPORT);

        Invoice invoice1 = new Invoice(customer1, "October", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice invoice2 = new Invoice(customer2, "February", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice invoice3 = new Invoice(customer3, "December", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        System.out.println("Testing invoice 1");
        invoice1.computeAmount();
        invoice1.printInvoice();
        System.out.println();

        System.out.println("Printing all invoices");
        Invoice[] invoice_list = {invoice1, invoice2, invoice3};

        Invoices.processInvoices(invoice_list);


    }
}
