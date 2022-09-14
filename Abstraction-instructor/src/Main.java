import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
Customer c1=new Customer(1,"Mohammed",'m');
Account a1=new Account(2,c1);
a1.deposit(5000);
System.out.println(a1.getBalance());

    }
}