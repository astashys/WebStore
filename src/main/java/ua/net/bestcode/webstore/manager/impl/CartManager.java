package ua.net.bestcode.webstore.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.impl.CartDAO;
import ua.net.bestcode.webstore.manager.ICartManager;
import ua.net.bestcode.webstore.manager.util.CartList;
import ua.net.bestcode.webstore.model.Cart;

/**
 * Created by petroborovets on 12/20/15.
 */
@Service
@Transactional
public class CartManager implements ICartManager {

    @Autowired
    private CartDAO cartDAO;

    @Override
    public Cart findCart(Integer id) {
        return cartDAO.findByPk(id);
    }

    @Override
    public Cart createCart(Cart data) {
        cartDAO.persist(data);
        return data;
    }

    @Override
    public Cart updateCart(Cart data) {
        cartDAO.update(data);
        return data;
    }

    @Override
    public void deleteCart(Cart data) {
        cartDAO.remove(data);
    }

    @Override
    public CartList findCartsByUser(Integer userId) {
        return cartDAO.findCartsByUser(userId);
    }

    @Override
    public CartList findCartsByProduct(Integer productId) {
        return cartDAO.findCartsByProduct(productId);
    }
}
