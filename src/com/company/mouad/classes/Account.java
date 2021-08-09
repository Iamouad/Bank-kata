package com.company.mouad.classes;

import java.io.PrintStream;
import java.util.Date;

import static com.company.mouad.classes.Amount.amountOf;

public class Account {
    private Operation operation;

    private Amount balance = amountOf(0);

    public Account(Operation operation) {
        this.operation = operation;
    }

    public void deposit(Amount value, Date date) {
        saveTransaction(value, date);
    }

    public void withdrawal(Amount value, Date date) {
        saveTransaction(value.negative(), date);
    }

    public void printStatement(PrintStream printer) {
        operation.printTo(printer);
    }

    private void saveTransaction(Amount value, Date date) {
        Transaction transaction = new Transaction(value, date);
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
        balance = balanceAfterTransaction;
        operation.addLineContaining(transaction, balanceAfterTransaction);
    }

}
