package ua.net.bestcode.webstore.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.impl.TransactionDAO;
import ua.net.bestcode.webstore.manager.ITransactionManager;
import ua.net.bestcode.webstore.manager.util.TransactionList;
import ua.net.bestcode.webstore.model.Transaction;

/**
 * Created by petroborovets on 12/20/15.
 */
@Service
@Transactional
public class TransactionManager implements ITransactionManager {
    @Autowired
    TransactionDAO transactionDAO;

    @Override
    public Transaction findTransaction(Integer id) {
        return transactionDAO.findByPk(id);
    }

    @Override
    public Transaction createTransaction(Transaction data) {
        transactionDAO.persist(data);
        return data;
    }

    @Override
    public Transaction updateTransaction(Transaction data) {
        transactionDAO.update(data);
        return data;
    }

    @Override
    public void deleteTransaction(Transaction data) {
        transactionDAO.remove(data);
    }

    @Override
    public TransactionList findUsersTransactions(Integer userId) {
        return transactionDAO.findUsersTransactions(userId);
    }
}
