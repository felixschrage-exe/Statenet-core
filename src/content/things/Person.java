package content.things;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String firstName;
	private String[] middleNames;
	private String lastName;
	private String title;
	private Gender gender;
	private Ethnicity ethnicity;

	private LocalDate dateOfBirth;
	private byte age;
	private AgeGroup ageGroup;

	private PoliticalView politicalView;

	public Person() {
		// TODO: IMPLEMENT CODE FOR GENERATING A PERSON RANDOMLY
	}

	public Person(String firstName, String[] middleNames, String lastName, String title, Gender gender, Ethnicity ethnicity, LocalDate dateOfBirth, PoliticalView politicalView) {
		this.firstName = firstName;
		this.middleNames = middleNames;
		this.lastName = lastName;
		this.title = title;
		this.gender = gender;
		this.ethnicity = ethnicity;
		this.dateOfBirth = dateOfBirth;
		this.politicalView = politicalView;
		setAge(); // sets age AND age group
	}

	// getter

	public String getFirstName(String firstName) {
		return this.firstName;
	}

	public String[] getMiddleNames(String[] middleNames) {
		return this.middleNames;
	}

	public String getLastName(String lastName) {
		return this.lastName;
	}

	public String getTitle(String title) {
		return this.title;
	}

	public Gender getGender(Gender gender) {
		return this.gender;
	}

	public Ethnicity getEthnicity(Ethnicity ethnicity) {
		return this.ethnicity;
	}

	public LocalDate getDateOfBirth(LocalDate dateOfBirth) {
		return this.dateOfBirth;
	}

	public byte getAge() {
		setAge();
		return this.age;
	}

	public AgeGroup getAgeGroup() {
		setAge();
		return this.ageGroup;
	}

	public PoliticalView getPoliticalView(PoliticalView politicalView) {
		return this.politicalView;
	}

	// setter

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleNames(String[] middleNames) {
		this.middleNames = middleNames;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setPoliticalView(PoliticalView politicalView) {
		this.politicalView = politicalView;
	}

	// overridden methods

	@Override
	public String toString() {
		return "";
	}

	// private helper methods

	private void setAge() {
		this.age = (byte) Period.between(dateOfBirth, LocalDate.now()).getYears();
		setAgeGroup();
	}

	private void setAgeGroup() {
		if (this.age <= 4) this.ageGroup = AgeGroup._0_4;
		else if (this.age <= 9) this.ageGroup = AgeGroup._5_9;
		else if (this.age <= 14) this.ageGroup = AgeGroup._10_14;
		else if (this.age <= 19) this.ageGroup = AgeGroup._15_19;
		else if (this.age <= 24) this.ageGroup = AgeGroup._20_24;
		else if (this.age <= 34) this.ageGroup = AgeGroup._25_34;
		else if (this.age <= 44) this.ageGroup = AgeGroup._35_44;
		else if (this.age <= 54) this.ageGroup = AgeGroup._45_54;
		else if (this.age <= 64) this.ageGroup = AgeGroup._55_64;
		else if (this.age <= 74) this.ageGroup = AgeGroup._65_74;
		else if (this.age <= 84) this.ageGroup = AgeGroup._75_84;
		else this.ageGroup = AgeGroup._85PLUS;
	}

}
