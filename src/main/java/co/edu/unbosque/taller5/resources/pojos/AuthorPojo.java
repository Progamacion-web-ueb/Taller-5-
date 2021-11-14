package co.edu.unbosque.taller5.resources.pojos;

public class AuthorPojo {

    private Integer authorId;
    private String name;

    public AuthorPojo() {
    }

    public AuthorPojo(Integer authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
