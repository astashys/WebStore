package ua.net.bestcode.webstore.dao;

import ua.net.bestcode.webstore.manager.util.TransactionList;
import ua.net.bestcode.webstore.model.Transaction;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface ITransactionDAO extends IGenericDAO<Transaction> {
    TransactionList findUsersTransactions(Integer userId);
}
