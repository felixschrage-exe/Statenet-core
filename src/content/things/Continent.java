package content.things;

import java.util.ArrayList;
import content.nation.Nation;

public class Continent {

    private String name;
    private String description;
    private float area;
    private ArrayList<Nation> nations;
    private long population;

    public Continent(String name, String description, float area, ArrayList<Nation> nations, long population) {
        this.name = name;
        this.description = description;
        this.area = area;
        this.nations = nations;
        this.population = population;
    }

    public Continent(String name, String description, float area, Nation[] nations, long population) {
        this.name = name;
        this.description = description;
        this.area = area;
        this.nations = new ArrayList<Nation>();
        this.population = population;

        for (Nation n : nations)
            this.nations.add(n);
    }

    public Continent(String name) {
        this.name = name;
        this.description = "No description";
        this.area = 0.0f;
        this.nations = new ArrayList<Nation>();
        this.population = 0;
    }

}