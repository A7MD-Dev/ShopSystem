package system.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length=50, nullable=false)
    private String roleName;

    @OneToOne(mappedBy = "role")
    @JsonManagedReference
    private User user;

    @OneToMany(mappedBy = "role")
    @JsonManagedReference
    private Set<Permission> rolePermissions;
}