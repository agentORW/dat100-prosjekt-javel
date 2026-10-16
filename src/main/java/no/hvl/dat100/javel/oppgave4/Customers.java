package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for (Customer customer : this.customers) {
            if (customer != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        for (Customer customer : this.customers) {
            if (customer != null && customer.getCustomer_id() == customer_id) {
                return customer;
            }
        }

        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] == null) {
                this.customers[i] = c;
                return true;
            }
        }

        return false;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null && this.customers[i].getCustomer_id() == customer_id) {
                Customer c = this.customers[i];
                this.customers[i] = null;
                return c;
            }
        }

        return null;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = new Customer[this.countNonNull()];

        int i_customers = 0;

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null) {
                customers[i_customers] = this.customers[i];
                i_customers++;
            }
        }

        return customers;
    }
}