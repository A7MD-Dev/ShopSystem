package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name="orders")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;

    @Column(name = "order_date", columnDefinition = "datetime")
    private Date orderDate;

    @Column(name="total_price", precision = 10, scale = 2)
    private String totalPrice;

    @Column(name="status", nullable=false)
    private OrderStatus status;

}
