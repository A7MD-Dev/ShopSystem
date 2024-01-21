package system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name", length=50, nullable=false)
    private String firstName;

    @Column(name="last_name", length=50, nullable=false)
    private String lastName;

    @Column(name="email", length=100, nullable=false, unique = true)
    private String email;

    @Column(name="password", length=255, nullable=false)
    private String password;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="role_id", referencedColumnName="id")
    private Role role;

    @OneToOne(mappedBy = "user")
    @JsonManagedReference
    private ShippingAddress shippingAddress;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private Set<Order> userOrders;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private Set<Review> userReviews;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
        name = "wishlists",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> wishlistProducts;
}