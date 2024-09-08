public class Account {

    private String name;
    private double balance;

    // Constructor that initializes the name and balance
    public Account(String name, double balance) {
        this.name = name;
        
        // Ensure that the initial balance is non-negative
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    // Setter method for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        // Only add positive deposit amounts
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    // Getter method for the balance
    public double getBalance() {
        return balance;
    }
}
