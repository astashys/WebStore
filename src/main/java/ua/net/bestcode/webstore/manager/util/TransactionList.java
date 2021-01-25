package ua.net.bestcode.webstore.manager.util;

import ua.net.bestcode.webstore.model.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petroborovets on 12/20/15.
 */
public class TransactionList {
    List<Transaction> transactions = new ArrayList<>();

    public TransactionList(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
