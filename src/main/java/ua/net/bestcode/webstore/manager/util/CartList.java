package ua.net.bestcode.webstore.manager.util;

import ua.net.bestcode.webstore.model.Cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petroborovets on 12/20/15.
 */
public class CartList {
    private List<Cart> carts = new ArrayList();

    public CartList(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
