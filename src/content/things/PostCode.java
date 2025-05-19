package content.things;

public class PostCode {
    
    private final String postcode;

    public PostCode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return this.postcode;
    }

}
