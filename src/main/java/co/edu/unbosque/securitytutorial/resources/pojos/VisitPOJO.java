package co.edu.unbosque.securitytutorial.resources.pojos;

public class VisitPOJO {

    private String visit_id;

    private String create_at;

    private String type;

    private Long description;

    private String pet_id;

    private String vet_id;

    public VisitPOJO() {

    }

    public VisitPOJO(String visit_id, String create_at, String type, Long description, String pet_id, String vet_id) {
        this.visit_id = visit_id;
        this.create_at = create_at;
        this.type = type;
        this.description = description;
        this.pet_id = pet_id;
        this.vet_id = vet_id;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
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

    public String getVet_id() {
        return vet_id;
    }

    public void setVet_id(String vet_id) {
        this.vet_id = vet_id;
    }
}
