package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;


@Entity
@Table(name="discounts")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Discount {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "discount_type")
    @Enumerated(EnumType.STRING)
    private DiscountType type;

    @Column(name="code", length = 50, nullable=false)
    private String code;

    @Column(name="value", length = 50, nullable=false)
    private String value;

    @Column(name = "start_date", columnDefinition = "datetime")
    private Date startDate;

    @Column(name = "end_date", columnDefinition = "datetime")
    private Date endDate;

}
