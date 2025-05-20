package content.things;

import java.util.HashSet;
import java.time.LocalDate;
import content.nation.Nation;

public class PointOfInterest {

    public static final HashSet<PointOfInterest> all = new HashSet<PointOfInterest>();
    
    private String name;
    private String description;
    private final LocalDate dateOfCompletion;
    private final District cityDistrict;

    public PointOfInterest(String name, String description, LocalDate dateOfCompletion, District cityDistrict) {
        this.name = name;
        this.description = description;
        this.dateOfCompletion = dateOfCompletion;
        this.cityDistrict = cityDistrict;
        all.add(this);
    }

    public PointOfInterest(String name, LocalDate dateOfCompletion, District cityDistrict) {
        this.name = name;
        this.description = "No description";
        this.dateOfCompletion = dateOfCompletion;
        this.cityDistrict = cityDistrict;
        all.add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getDateOfCompletion() {
        return this.dateOfCompletion;
    }

    public District getDistrict() {
        return this.cityDistrict;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
