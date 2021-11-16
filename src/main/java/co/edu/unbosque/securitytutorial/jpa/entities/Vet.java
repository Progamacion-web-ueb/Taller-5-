package co.edu.unbosque.securitytutorial.jpa.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vet")
@PrimaryKeyJoinColumn
public class Vet extends UserApp {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;

    @OneToMany(mappedBy = "vet", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Visit> visit;

    public Vet() {
    }

    public Vet(String username, String password, String email,  String name, String address, String neighborhood) {
        super(username, password, email, "vet");
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
