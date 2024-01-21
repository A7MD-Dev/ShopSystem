package system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="order_items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="order_id", referencedColumnName="id")
    private Order order;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="product_id", referencedColumnName="id")
    private Product product;

    @Column(name="quantity", nullable=false)
    private int quantity;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

}
