package Excep;

public class ATMapplication {

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static void login(String pin) throws SecurityException {
        if (!pin.equals("7852")) {
            throw new SecurityException("Access denied");
        } else {
            System.out.println("Successful Login");
        }
    }

    static void balance(int amount, int balance) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            System.out.println("Withdrawal Successful. Remaining Balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            login("1324");
        } catch (SecurityException e) {
            System.out.println("Invalid pin: " + e.getMessage());
        }

        try {
            balance(5000, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawl is Denied : " + e.getMessage());
        }
    }
}
