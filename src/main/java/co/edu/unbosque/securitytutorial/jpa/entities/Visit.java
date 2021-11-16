package co.edu.unbosque.securitytutorial.jpa.entities;

import javax.persistence.*;

@Table(name = "visit")
@Entity
public class Visit {

    @Id
    @Column(name = "visit_id")
    private String visit_id;

    @Column(name = "created_at", nullable = false)
    private Long created_at;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne()
    @JoinColumn(name="vet_id", referencedColumnName="username")
    private Vet vet;

    @ManyToOne()
    @JoinColumn(name="pet_id", referencedColumnName="pet_id")
    private Pet pet;





    public Visit() {
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}