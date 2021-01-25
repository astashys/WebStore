package ua.net.bestcode.webstore.manager;

import ua.net.bestcode.webstore.manager.util.TransactionList;
import ua.net.bestcode.webstore.model.Transaction;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface ITransactionManager {
    Transaction findTransaction(Integer id);
    Transaction createTransaction(Transaction data);
    Transaction updateTransaction(Transaction data);
    void deleteTransaction(Transaction data);
    TransactionList findUsersTransactions(Integer userId);
}
