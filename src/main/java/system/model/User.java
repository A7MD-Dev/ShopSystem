package system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="first_name", length=50, nullable=false)
    private String firstName;

    @Column(name="last_name", length=50, nullable=false)
    private String lastName;

    @Column(name="email", length=100, nullable=false, unique = true)
    private String email;

    @Column(name="password", length=255, nullable=false)
    private String password;

    @ManyToOne
    @JoinColumn(name="role_id", referencedColumnName="id")
    private Role role;

}