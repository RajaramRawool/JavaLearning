package javacourse.codingexercises.ArrayListCoding;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }


    public void addTransaction(double newTransaction) {
            transactions.add(newTransaction);
    }

//    public void printTransaction() {
//        for (int i = 0; i < transactions.size(); i++) {
//            System.out.println((i+1)+ "\tTransaction : " + transactions.get(i));
//        }
//    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

