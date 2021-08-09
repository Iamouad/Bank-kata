package com.company.mouad;

import com.company.mouad.classes.Account;
import com.company.mouad.classes.Operation;

import static com.company.mouad.classes.Amount.amountOf;
import static com.company.mouad.utils.StringToDate.date;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(new Operation());

        account.deposit(amountOf(1000), date("10/01/2020"));
        account.withdrawal(amountOf(1500), date("15/01/2020"));
        account.deposit(amountOf(2000), date("15/10/2020"));
        account.withdrawal(amountOf(500), date("12/10/2021"));

        account.printStatement(System.out);
    }

}
