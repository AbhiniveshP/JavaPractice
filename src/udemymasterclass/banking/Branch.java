package udemymasterclass.banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name, double transaction) {
        if(findCustomer(name) != null) return false;
        Customer customer = new Customer(name, transaction);
        this.customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if(customer == null) return false;
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if ( customer.getName().equals(name) ) return customer;
        }
        return null;
    }

}