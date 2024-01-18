package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="products")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length=255, nullable=false)
    private String productName;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;


    @Column(name="quantity", nullable=false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName="id")
    private Category category;

    @Column(name="image_url", length=255, nullable=false)
    private String imgUrl;

    @OneToMany(mappedBy = "product")
    private Set<Review> productReviews;

    @ManyToMany(mappedBy = "wishlistProducts")
    private Set<User> productWishlists;
}