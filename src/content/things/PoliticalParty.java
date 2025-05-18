package content.things;

import java.util.HashMap;
import java.time.LocalDate;

public class PoliticalParty {

	private String name;
	private String slogan;
	private String description;
	private LocalDate foundingDate;

	private Person leader;
	private Person leadCandidate;
	private HashMap<Person, Float> members; // Every member has a rating how happy the party is with them  
	
	private PoliticalView politicalView;
	
}
