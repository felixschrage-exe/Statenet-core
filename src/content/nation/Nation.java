package content.nation;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;

import content.things.*;

public class Nation {

	public static final HashMap<String, Nation> REGISTER = new HashMap<String, Nation>();
	
	// general nation info
	private String presentationName;
	private String officialName;
	private String description;
	private LocalDate foundingDate;
	private String stateId;
	private Map<LocalDate, String[]> nationwideHolidays;
	private Continent continent;
	private Flag flag;
	private float sizeSqKm;
	// private TimeZone timeZone;

	// language
	private Set<Language> officialLanguages;
	private Set<String> dialects;

	// nation's money
	private Currency currency;
	private float gdp;
	private float gnp;
	private float actualInflation;
	private float inflationChange;

	// people's money
	private float medianWage;
	private float[] medianWagePerAgeGroup; // length must be EXACTLY EQUAL to the amount of age groups
	private float[] medianWagePerEthnicity; // length must be EXACTLY EQUAL to the amount of ethicities
	private float[] medianWagePerGender; // length must be EXACTLY EQUAL to the amount of genders
	private float[] medianWagePerState; // length must be EXACTLY EQUAL to the amount of states
	private float avgWage;
	private float[] avgWagePerAgeGroup; // length must be EXACTLY EQUAL to the amount of age groups
	private float[] avgWagePerEthnicity; // length must be EXACTLY EQUAL to the amount of ethicities
	private float[] avgWagePerGender; // length must be EXACTLY EQUAL to the amount of genders
	private float[] avgWagePerState; // length must be EXACTLY EQUAL to the amount of states

	// general city/structural info
	private boolean hasSingleCapital;
	private Set<String> capitals;
	private Set<String> cities;
	private Set<String> states;

	// population
	private long population;
	private float percentageHomeless;
	private float percentageHasCar;
	private float avgCarsPerPerson;
	
	// national politics
	private Government formOfGovernment;
	private boolean hasPresident;
	private boolean hasChancellor;
	private String presidentName;
	private String chancellorName;
	//private Role roleOfChancellor;
	//private Role roleOfPresident;
	private boolean isRepublic;
	private boolean isFederation;
	private Set<String> parties;
	private PoliticalView politicalView;

	// international politics
	private Set<String> neighbouringNations;
	private Set<String> friendlyNations;
	private Set<String> neutralNations;
	private Set<String> hostileNations;
	private Set<String> recognizedNations;
	private Map<String, Float> goodExports;
	private Map<String, Float> goodImports;

	// energy
	private float energyUsageMW;
	private float energyGenerationMW;
	private float energyCapacityMW;

	// climate/weather
	private TempUnit tempUnit; 
	private float maxTemp;
	private float minTemp;
	private float rainProbability;
	private float stormProbability;
	private float generalAirQuality;
	private float wildfireProbability;

	// demographics  (age, ethnicity, sexuality, gender and similar)
	private Map<Ethnicity, Float> ethnicDistribution;
	private Map<Gender, Float> genderDistribution;
	private Map<Sexuality, Float> sexualityDistribution;
	private Map<Religion, Float> religionDistribution;
	private float percentageNativeBorn;
	private float percentageImmigrants;
	private float percentageIllegalImmigrants;
	private long deathRate;
	private long birthRate;
	private float[] ageDistribution; // length must be EXACTLY EQUAL to the amount of age groups

	// education
	private float avgEducationLevelGeneral; // IS CALCULATED BY USING THE 'EducationLevel'-ENUM !!! DO NOT SET THIS MANUALLY!
	private float[] avgEducationLevelPerGender;
	private float[] avgEducationLevelPerEthnicity;
	private float[] avgEducationLevelPerParentalIncome;
	private float percentageIllitarate;
		
}
