package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.CustomerMain;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        int size = 3;

        Customer customer1 = new Customer("Caroline Jones", "caroline.jones@pinkplace.com", 1, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("Cat", "cat@pinkplace.com", 60, PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("Mother", "mother.jones@pinkplace.com", 25, PowerAgreementType.POWERSUPPORT);

        Customers customers = new Customers(size);

        customers.addCustomer(customer1);
        customers.addCustomer(customer2);
        customers.addCustomer(customer3);

        double[][][] CustomerPowerUsageDatas = {CustomerPowerUsageData.usage_month_customer1, CustomerPowerUsageData.usage_month_customer2, CustomerPowerUsageData.usage_month_customer3};

        Invoice[] invoice_list = new Invoice[size];
        Customer[] customer_list = customers.getCustomers();
        for (int i = 0; i < size; i++) {
            Invoice invoice = new Invoice(
                    customer_list[i],
                    "October",
                    CustomerPowerUsageDatas[i],
                    MonthPowerData.powerprices_month);

            invoice_list[i] = invoice;
        }

        System.out.println("Printing all invoices");
        Invoices.processInvoices(invoice_list);

    }
}
