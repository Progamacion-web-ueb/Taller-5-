package co.edu.unbosque.securitytutorial.resources.pojos;

public class PetCasePOJO {

    private String case_id;

    private String create_at;

    private String type;

    private Long description;

    private String pet_id;

    public PetCasePOJO() {
    }

    public PetCasePOJO(String case_id, String create_at, String type, Long description, String pet_id) {
        this.case_id = case_id;
        this.create_at = create_at;
        this.type = type;
        this.description = description;
        this.pet_id = pet_id;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }
}
