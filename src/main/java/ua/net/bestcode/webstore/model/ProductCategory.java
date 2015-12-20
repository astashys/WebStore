package ua.net.bestcode.webstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by petroborovets on 12/20/15.
 */
@Entity
@Table(name = "PRODUCT_CATEGORIES")
public class ProductCategory {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "productCategory")
    private Set<Product> categoryProducts = new HashSet<>(0);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getCategoryProducts() {
        return categoryProducts;
    }

    public void setCategoryProducts(Set<Product> categoryProducts) {
        this.categoryProducts = categoryProducts;
    }
}
