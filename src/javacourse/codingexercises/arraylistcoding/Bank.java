package javacourse.codingexercises.arraylistcoding;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
//    public static Scanner scanner = new Scanner(System.in);

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public static void main(String[] args) {
//        showOptions();
//
//        boolean quit = false;
//        while (!quit) {
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    System.out.println("Adding Branch......");
//                    break;
//                case 1:
//                    System.out.println("Adding Customer......");
//                    break;
//                case 2:
//                    System.out.println("Adding Transaction......");
//                    break;
//                case 3:
//                    System.out.println("Printing Contacts list......");
//                    printContactsList();
//                    break;
//                case 4:
//                    quit = true;
//                    break;
//                case 5:
//                    showOptions();
//                    break;
//
//
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
//
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
//
        bank.listCustomers("Adelaide", true);
//
//
//
//
            }


//    private static void printContactsList() {
//
//    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equalsIgnoreCase(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer : " + branchCustomers.get(i).getName()+"["
                        + (i+1) +"]" );
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> customerTransaction = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < customerTransaction.size(); j++) {
                        System.out.println("["+(j+1)+"] " + "Amount  "+customerTransaction.get(j) );
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
    //    public static void showOptions() {
//        System.out.println("Choose from below options :-");
//        System.out.println("0\tAdd new Branch\n" +
//                "1\tAdd new Customer to Branch\n" +
//                "2\tAdd transaction for existing Customer\n" +
//                "3\tShow list of Customers for Branch\n" +
//                "4\tQuit\n" +
//                "5\tShow Options\n");
//        System.out.print("Enter Your Choice :- ");
//    }
}
