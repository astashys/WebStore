package ua.net.bestcode.webstore.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import ua.net.bestcode.webstore.dao.GenericDAO;
import ua.net.bestcode.webstore.dao.ICartDAO;
import ua.net.bestcode.webstore.manager.util.CartList;
import ua.net.bestcode.webstore.model.Cart;


/**
 * Created by petroborovets on 12/20/15.
 */
@Repository
public class CartDAO extends GenericDAO<Cart> implements ICartDAO {
    @Override
    public CartList findCartsByUser(Integer userId) {
        Query query = currentSession().createQuery("from Cart where user =: userId");
        query.setParameter("userId", userId);
        return new CartList(query.list());
    }

    @Override
    public CartList findCartsByProduct(Integer productId) {
        Query query = currentSession().createQuery("from Cart where product =: productId");
        query.setParameter("product", productId);
        return new CartList(query.list());
    }
}
