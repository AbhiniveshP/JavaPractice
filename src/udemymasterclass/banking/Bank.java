package udemymasterclass.banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if(branch != null) return false;
        this.branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch == null) return false;
        return branch.newCustomer(customerName, transaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch == null) return false;
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String name) {
        for(int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if ( branch.getName().equals(name) ) return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if(branch == null) return false;
        System.out.println("Customer details for branch " + branchName);
        ArrayList<Customer> customers = branch.getCustomers();
        for( int i = 0;  i < customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
            if (printTransactions) {
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                System.out.println("Transactions");
                for( int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j+1) + "]" + "  Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        System.out.println("*********** Printing Transactions Triggered *************");
        bank.listCustomers("Adelaide", true);
        System.out.println("*********** Printing Transactions Non-Triggered *************");
        bank.listCustomers("Adelaide", false);

    }

}
