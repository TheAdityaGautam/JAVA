package OOPS;

class Account {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(1000);
        System.out.println(a.getBalance());
    }
}