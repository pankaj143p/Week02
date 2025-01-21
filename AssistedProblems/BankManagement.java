package AssistedProblems;
/*
 * Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer 
can have multiple bank accounts, 
and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.

 */
// Bank class with name
 class Bank{
    // private String name;
    // Bank(String name){
    //     this.name = name;
    // }
    // public String getName(){
    //     return name;
    // }
    // openAccount method
    public void openAccount(Customer customer){
        System.out.println("Account opened for " + customer.getName());
    }
 }
// Customer class with name and account balance
 class Customer{
    private String name;
    private String accountNumber;
    private double balance;

    Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void viewBalance(){
        System.out.println("Balance: " + balance);
    }
    public void setBalance(double balance){
        this.balance = balance;
    }   
    public String getAccountNumber(){
        return accountNumber;
    }
    // displayAll method
    public void displayAll(){
        System.out.println("Name: " + name + " Account Number: " + accountNumber + " Balance: " + balance);
    }

 }
public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("Nishant");
        customer1.setBalance(7000000);
        customer1.displayAll();
        bank.openAccount(customer1);
        customer1.viewBalance();

     

    }
    
}
