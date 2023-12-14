public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private  String customerPhone;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail,
                   String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        customerPhone = phone;
    }

    public void depositFunds (double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $ " + balance);
    }
}
