package ua.net.bestcode.webstore.dao.impl;

import org.springframework.stereotype.Repository;
import ua.net.bestcode.webstore.dao.GenericDAO;
import ua.net.bestcode.webstore.dao.IProductCategoryDAO;
import ua.net.bestcode.webstore.model.ProductCategory;

/**
 * Created by petroborovets on 12/20/15.
 */
@Repository
public class ProductCategoryDAO extends GenericDAO<ProductCategory> implements IProductCategoryDAO {
}
