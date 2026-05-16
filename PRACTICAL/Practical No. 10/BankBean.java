import javax.ejb.Stateless;

@Stateless
public class BankBean {

public double deposit(double balance, double amount){
return balance + amount;
}

public double withdraw(double balance, double amount){
return balance - amount;
}
}