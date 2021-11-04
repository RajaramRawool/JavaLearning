package javacourse.codingexercises.ArrayListCoding;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initialTransaction);
            this.customers.add(newCustomer);
            return true;
        }else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName , double amount) {
        if (findCustomer(customerName) != null) {
            Customer existingCustomer = findCustomer(customerName);
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equalsIgnoreCase(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

