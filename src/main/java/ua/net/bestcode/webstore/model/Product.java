package ua.net.bestcode.webstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by petroborovets on 12/20/15.
 */
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STOCK")
    private Integer stock;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "IMAGE_SOURCE")
    private String imageSource;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_CATEGORY_FK", nullable = false)
    private ProductCategory productCategory;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Cart> productCarts = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Transaction> productTransactions = new HashSet<>(0);

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Set<Cart> getProductCarts() {
        return productCarts;
    }

    public void setProductCarts(Set<Cart> productCarts) {
        this.productCarts = productCarts;
    }

    public Set<Transaction> getProductTransactions() {
        return productTransactions;
    }

    public void setProductTransactions(Set<Transaction> productTransactions) {
        this.productTransactions = productTransactions;
    }
}
