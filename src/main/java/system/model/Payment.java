package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name="payments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="order_id", referencedColumnName="id")
    private Order order;

    @Column(name = "payment_method", length = 50, nullable = false)
    private Date paymentMethod;

    @Column(name="payment_status", nullable = false)
    private PaymentStatus status;

    @Column(name="transaction_id", length = 255, nullable=false)
    private String transactionId;

}
