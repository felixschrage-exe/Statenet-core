package content.things;

import java.util.HashSet;

public class Language {

	public static final HashSet<Language> all = new HashSet<Language>();

	private String name;

	public Language(String name) {
		this.name = name;
		if (!all.contains(this))
			all.add(this);
	}

	public String name() {
		return this.name;
	}
}
