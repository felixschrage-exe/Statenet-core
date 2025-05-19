package content.things;

import java.util.HashSet;
import java.time.LocalDate;
import content.nation.Nation;

public class PointOfInterest {

    public static final HashSet<PointOfInterest> all = new HashSet<PointOfInterest>();
    
    private String name;
    private String description;
    private LocalDate dateOfCompletion;

    private City city;
    private String cityDistrict;
    private State state;
    private Nation nation;

    public PointOfInterest(String name, String description, LocalDate dateOfCompletion, City city) {
        this.name = name;
        this.description = description;
        this.dateOfCompletion = dateOfCompletion;
        this.city = city;
        this.state = city.getState();
        this.nation = city.getNation();
        all.add(this);
    }

    public PointOfInterest(String name, LocalDate dateOfCompletion, City city) {
        this.name = name;
        this.description = "No description";
        this.dateOfCompletion = dateOfCompletion;
        this.city = city;
        this.state = city.getState();
        this.nation = city.getNation();
        all.add(this);
        
    }

}
