package co.edu.unbosque.securitytutorial.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name = "official")
@Entity
@PrimaryKeyJoinColumn
public class Official extends UserApp {

    @Column(name = "name", nullable = false)
    private Long name;

    public Official() {
    }

    public Official(String username, String password, String email, String role, Long name) {
        super(username, password, email, role);
        this.name = name;
    }


    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }
}