package content.things;

import java.util.HashSet;

public class Ethnicity {

    public static final HashSet<Ethnicity> all = new HashSet<Ethnicity>();

    public final String name;

    public Ethnicity(String name) {
        this.name = name;
        if (!all.contains(this))
			all.add(this);
    }

}