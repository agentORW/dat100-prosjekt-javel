package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

import javax.swing.*;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer myCustomer = new Customer("Wybie Cool", "wybie.evil@omg.com", 42, PowerAgreementType.SPOTPRICE);

        System.out.println(myCustomer.getName());
        myCustomer.setName("Wybie Awesome");

        System.out.println(myCustomer.getEmail());
        myCustomer.setEmail("wybye.dagoat@girlihavenfallforyou.com");

        System.out.println(myCustomer.getCustomer_id());
        myCustomer.setCustomer_id(56);

        System.out.println(myCustomer.getAgreement());
        myCustomer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("My customer tostring: \n" + myCustomer);

    }
}
