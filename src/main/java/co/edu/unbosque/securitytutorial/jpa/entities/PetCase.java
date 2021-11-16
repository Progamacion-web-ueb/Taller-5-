package co.edu.unbosque.securitytutorial.jpa.entities;

import javax.persistence.*;

@Table(name = "pet_case")
@Entity
public class PetCase {
    @Id
    @Column(name = "case_id")
    private String case_id;

    @Column(name = "created_at", nullable = false, unique = true)
    private Long created_at;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;


    @ManyToOne()
    @JoinColumn(name="pet_id", referencedColumnName="pet_id")
    private Pet pet;

    public PetCase() {
    }

    public String getCase_id() {
        return case_id;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}