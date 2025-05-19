package content.things;

import java.time.LocalDate;

public class Award {
    
    private final String name;
    private String description;
    private final LocalDate winningDate;
    private final float priceMoney;

    public Award(String name, String description, LocalDate winningDate, float priceMoney) {
        this.name = name;
        this.description = description;
        this.winningDate = winningDate;
        this.priceMoney = priceMoney;
    }

    public Award(String name, LocalDate winningDate, float priceMoney) {
        this.name = name;
        this.description = "No description";
        this.winningDate = winningDate;
        this.priceMoney = priceMoney;
    }

    public Award(String name, String description, LocalDate winningDate) {
        this.name = name;
        this.description = description;
        this.winningDate = winningDate;
        this.priceMoney = 0.0f;
    }

    public Award(String name, LocalDate winningDate) {
        this.name = name;
        this.description = "No description";
        this.winningDate = winningDate;
        this.priceMoney = 0.0f;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getWinningDate() {
        return this.winningDate;
    }

    public float getPriceMoney() {
        return this.priceMoney;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
