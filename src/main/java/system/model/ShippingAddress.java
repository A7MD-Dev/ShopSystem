package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ship_address")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;

    @Column(name="address_line_1", length=255,  nullable=false)
    private String addressLine1;

    @Column(name="address_line_2", length=255,  nullable=false)
    private String addressLine2;

    @Column(name="city", nullable=false)
    private String city;

    @Column(name="state", nullable=true)
    private String state;

    @Column(name="zip_code", nullable=true)
    private String zipCode;

    @Column(name="country", nullable=false)
    private String country;

}
