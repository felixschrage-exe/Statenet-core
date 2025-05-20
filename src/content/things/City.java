package content.things;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.ArrayList;
import content.nation.Nation;

public class City {

    public static final HashSet<City> all = new HashSet<City>();

    private String name;
    private String description;
    private LocalDate foundationDate;
    private long population;
    private District[] districts;
    private PostCode postcode;
    private State state;
    private float area;
    private CityType type;
    private CityRole role;
    private Politician mayor;
    private ArrayList<Award> awards;

    private float gdp;
    private float gdpPerCapita;
    private float unemploymentRate;

    private boolean hasAirport;
    private boolean hasUniversity;
    private boolean hasPublicHarbour;
    private boolean hasCargoHarbour;
    private ArrayList<PointOfInterest> pointsOfInterest;

    private ArrayList<City> partnerCities;

    public City(
        String name,
        String description,
        LocalDate foundationDate,
        long population,
        District[] districts,
        PostCode postcode,
        State state,
        float area,
        CityType cityType,
        CityRole cityRole,
        Politician mayor,
        Award[] awards,
        float gdp,
        float unemploymentRate,
        boolean hasAirport,
        boolean hasUniversity,
        boolean hasPublicHarbour,
        boolean  hasCargoHarbour,
        City[] partnerCities
    ) {
        this.name = name;
        this.description = description;
        this.foundationDate = foundationDate;
        this.population = population;
        this.districts = districts;
        this.postcode = postcode;
        this.state = state;
        this.area = area;
        this.type = cityType;
        this.role = cityRole;
        this.mayor = mayor;
        for (Award a : awards) this.awards.add(a);
        this.gdp = gdp;
        this.gdpPerCapita = (float) gdp / population;
        this.unemploymentRate = unemploymentRate;
        this.hasAirport = hasAirport;
        this.hasCargoHarbour = hasCargoHarbour;
        this.hasPublicHarbour = hasPublicHarbour;
        this.hasUniversity = hasUniversity;
        for (City c : partnerCities) this.partnerCities.add(c);
    }

    public City(
        String name,
        LocalDate foundationDate,
        long population,
        District[] districts,
        PostCode postcode,
        State state,
        float area,
        CityType cityType,
        CityRole cityRole,
        Politician mayor
    ) {
        this.awards = new ArrayList<Award>();
        this.partnerCities = new ArrayList<City>();

        this.name = name;
        this.description = "No descriptio.n";
        this.foundationDate = foundationDate;
        this.population = population;
        this.districts = districts;
        this.postcode = postcode;
        this.state = state;
        this.area = area;
        this.type = cityType;
        this.role = cityRole;
        this.mayor = mayor;
        this.gdp = 0.0f;
        this.gdpPerCapita = 0.0f;
        this.unemploymentRate = 0.0f;
        this.hasAirport = false;
        this.hasCargoHarbour = false;
        this.hasPublicHarbour = false;
        this.hasUniversity = false;
    }

    // getters

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getFoundingDate() {
        return this.foundationDate;
    }

    public long getPopulation() {
        return this.population;
    }

    public District[] getDistricts() {
        return this.districts;
    }

    public PostCode getPostcode() {
        return this.postcode;
    }

    public State getState() {
        return this.state;
    }

    public Nation getNation() {
        return this.state.getNation();
    }

    public float getArea() {
        return this.area;
    }

    public CityType getCityType() {
        return this.type;
    }

    public CityRole getCityRole() {
        return this.role;
    }

    public Politician getMayor() {
        return this.mayor;
    }

    public ArrayList<Award> getAwards() {
        return this.awards;
    }

    public float getGdp() {
        return this.gdp;
    }

    public float getGdpPerCapita() {
        this.gdpPerCapita = (float) this.gdp / this.population;
        return this.gdpPerCapita;
    }

    public float getUnemploymentRate() {
        return this.unemploymentRate;
    }
 
    public boolean getHasAirport() {
        return this.hasAirport;
    }

    public boolean getHasUniversity() {
        return this.hasUniversity;
    }

    public boolean getHasPublicHarbour() {
        return this.hasPublicHarbour;
    }

    public boolean getHasCargoHarbour() {
        return this.hasCargoHarbour;
    }

    public ArrayList<PointOfInterest> getPointsOfInterests() {
        return this.pointsOfInterest;
    }

    public ArrayList<City> getPartnerCities() {
        return this.partnerCities;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFoundingDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public void setPopulation(long population) {
        this.population = population;
        if (population < 1000) this.type = CityType.VILLAGE;
        else if (population < 20_000) this.type = CityType.TOWN;
        else if (population < 800_000) this.type = CityType.CITY;
        else if (population < 10_000_000) this.type = CityType.METROPOLIS;
        else this.type = CityType.MEGACIY;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public void setPostcode(PostCode postcode) {
        this.postcode = postcode;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCityRole(CityRole role) {
        this.role = role;
    }

    public void setMayor(Politician mayor) {
        this.mayor = mayor;
    }

    public void setAwards(ArrayList<Award> awards) {
        this.awards = awards;
    }

    public void addAward(Award award) {
        this.awards.add(award);
    }

    public void setGdp(float gdp) {
        this.gdp = gdp;
        this.gdpPerCapita = gdp / this.population;
    }

    public void setUnemploymentRate(float unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
    }
 
    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }

    public void setHasUniversity(boolean hasUniversity) {
        this.hasUniversity = hasUniversity;
    }

    public void setHasPublicHarbour(boolean hasPublicHarbour) {
        this.hasPublicHarbour = hasPublicHarbour;
    }

    public void setHasCargoHarbour(boolean hasCargoHarbour) {
        this.hasCargoHarbour = hasCargoHarbour;
    }

    public void setPointsOfInterests(ArrayList<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public void addPointOfInterest(PointOfInterest pointOfInterest) {
        this.pointsOfInterest.add(pointOfInterest);
    }

    public void setPartnerCities(ArrayList<City> partnerCities) {
        this.partnerCities = partnerCities;
    }

    public void addPartnerCity(City partnerCity) {
        this.partnerCities.add(partnerCity);
    }
}