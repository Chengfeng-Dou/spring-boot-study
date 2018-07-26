package domain.security;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "sys_role")
@IdClass(SystemRole.class)
public class SystemRole implements Serializable {
    @Id
    @Column(name = "uid")
    private long id;

    @Id
    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private Role role;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    String getRoleString(){
        return role.name();
    }
}
