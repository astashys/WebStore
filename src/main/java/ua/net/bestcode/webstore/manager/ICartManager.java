package ua.net.bestcode.webstore.manager;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.manager.util.CartList;
import ua.net.bestcode.webstore.model.Cart;

/**
 * Created by petroborovets on 12/20/15.
 */
@Service
@Transactional
public interface ICartManager {
    Cart findCart(Integer id);
    Cart createCart(Cart data);
    Cart updateCart(Cart data);
    void deleteCart(Cart data);
    CartList findCartsByUser(Integer userId);
    CartList findCartsByProduct(Integer productId);
}
