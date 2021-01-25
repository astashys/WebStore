package ua.net.bestcode.webstore.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import ua.net.bestcode.webstore.dao.GenericDAO;
import ua.net.bestcode.webstore.dao.ITransactionDAO;
import ua.net.bestcode.webstore.manager.util.TransactionList;
import ua.net.bestcode.webstore.model.Transaction;

/**
 * Created by petroborovets on 12/20/15.
 */
@Repository
public class TransactionDAO extends GenericDAO<Transaction> implements ITransactionDAO {
    @Override
    public TransactionList findUsersTransactions(Integer userId) {
        Query query = currentSession().createQuery("from Transaction where user =: userId");
        query.setParameter("userId", userId);
        return new TransactionList(query.list());
    }
}
