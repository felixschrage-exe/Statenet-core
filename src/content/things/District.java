package content.things;

public class District {

    private String name;
    private final City city;
    private PostCode postcode;

    public District(String name, City city, PostCode postcode) {
        this.name = name;
        this.city = city;
        this.postcode = postcode;
    }

    public String getName() {
        return this.name;
    }
    
    public City getCity() {
        return this.city;
    }

    public PostCode getPostcode() {
        return this.postcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostcode(PostCode postcode) {
        this.postcode = postcode;
    }

    
}
