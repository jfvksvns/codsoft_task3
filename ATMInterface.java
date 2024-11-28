import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance; 
    }
    public void deposit(double amount) {
        balance += amount; 
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        else
        return false;
    }
    public double getBalance() {
        return balance;
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(00.0);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n ATM Menu: \n 1. Withdraw \n 2. Deposit \n 3. Check Balance \n 4. Exit ");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful thanks for transaction.");
                    } else {
                        System.out.println("Insufficient balance , check balance first before next transaction.");
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful thanks for transaction.");
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM .");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again after sometime.");
            }
        }
    }
}