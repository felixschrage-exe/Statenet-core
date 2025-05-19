package content.things;

import java.util.HashMap;
import java.time.LocalDate;

public class PoliticalParty {

	private String name;
	private String slogan;
	private String description;
	private LocalDate foundingDate;

	private Politician leader;
	private Politician leadCandidate;
	private HashMap<Politician, Float> members; // Every member has a rating how happy the party is with them

	private PoliticalView politicalView;

}
