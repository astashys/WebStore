package ua.net.bestcode.webstore.dao;

import ua.net.bestcode.webstore.manager.util.CartList;
import ua.net.bestcode.webstore.model.Cart;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface ICartDAO extends IGenericDAO<Cart> {
    CartList findCartsByUser(Integer userId);
    CartList findCartsByProduct(Integer productId);
}
