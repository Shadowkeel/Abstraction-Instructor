public class Account {
    private int ID;
    private Customer customer;
    private double balance;
    public Account(int ID,Customer customer,double balance){
        this.ID=ID;
   this.customer=customer;
   this.balance=balance;
    }

    public Account() {
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomername(){
        return "Customer name is:"+customer.getName();
    }
    public double deposit(double amount){
    double newBalance=balance+amount;
    return balance +=newBalance;
    }
    public void withdraw(double amount){
     if (balance>amount){
      balance =balance-amount;
         System.out.println("withdraw successful");
     } else{
         System.out.println("balance is not enough");
       }
    }
}
