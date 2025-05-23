package content.things;

import java.util.HashSet;

public class Currency {

    public static final HashSet<Currency> all = new HashSet<Currency>();
    
    private final String name;
    private final char symbol;

    private float value;

    public Currency(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        all.add(this);
    }

    public String getName() {
        return this.name;
    }

    public char getDescription() {
        return this.symbol;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float newValue) {
        this.value = newValue;
    }

    
}
