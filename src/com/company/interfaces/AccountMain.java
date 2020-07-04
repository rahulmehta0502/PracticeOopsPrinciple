package com.company.interfaces;

public class AccountMain {
    public static void main(String[] args) {

            Account a = new Account();
            a.setBalanced( 1000 );
            System.out.println( "balance is : " + a.getBalance() );

    }
}
