package com.esubalew;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("123", 0, "Bob", "myemail", "2614216" );
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);
    }
}
