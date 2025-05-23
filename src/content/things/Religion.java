package content.things;

import java.util.HashSet;

public class Religion {

    public static final HashSet<Religion> all = new HashSet<Religion>();
    
    public int members;
    private String name;
    private String description;

    public Religion(String name, String description) {
        this.name = name;
        this.description = description;
        this.members = 0;
        all.add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
