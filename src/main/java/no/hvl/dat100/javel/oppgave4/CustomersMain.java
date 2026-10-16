package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // name, email, id, agreement

        Customer customer1 = new Customer("Caroline Jones", "caroline.jones@pinkplace.com", 1, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("Cat", "cat@pinkplace.com", 60, PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("Mother", "mother.jones@pinkplace.com", 25, PowerAgreementType.POWERSUPPORT);
        Customer customer4 = new Customer("Other Mother", "other.mother@pinkplace.com", 5, PowerAgreementType.NORGESPRICE);

        Customers customers = new Customers(4);
        System.out.println("Adding customers");
        System.out.println(customers.addCustomer(customer1));
        System.out.println(customers.addCustomer(customer2));
        System.out.println(customers.addCustomer(customer3));
        System.out.println(customers.addCustomer(customer4));


        System.out.println("Amount of customers: " + customers.countNonNull());
        System.out.println("Should give other mother:\n" + customers.getCustomer(5) + "\n");
        System.out.println("Should give cat:\n" + customers.removeCustomer(60) + "\n");
        Customer removed = customers.getCustomer(60);
        if (removed == null) {
            System.out.println("Cat succecfully removed");
        }

        System.out.println("All customers: \n" + Arrays.toString(customers.getCustomers()));

    }
}
