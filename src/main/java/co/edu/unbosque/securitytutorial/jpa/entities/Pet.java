package co.edu.unbosque.securitytutorial.jpa.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Table(name = "pet")
@Entity
public class Pet  {

    @Id
    @Column(name = "pet_id", nullable = false)
    private Long pet_id;

    @Column(name = "microchip", nullable = false, unique = true)
    private Long microchip;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "species", nullable = false)
    private String species;

    @Column(name = "race", nullable = false)
    private String race;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "picture", nullable = false)
    private String picture;


    @ManyToOne()
    @JoinColumn(name="owneer_id", referencedColumnName="username")
    private Owner owner;

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<PetCase> pet_case;



    @OneToMany(mappedBy = "pet",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @Fetch(value = FetchMode.JOIN)
    private List<Visit> Visit;


    public Pet() {
    }


}