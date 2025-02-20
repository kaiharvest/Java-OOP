package programmer.zama.now.data;

import programmer.zama.now.Anotation.Fancy;

@Fancy(name = "AnimalaApp", tag = {"aplication", "java"})

public enum Level {

	STANDARD ("Standard Level"),
	PREMIUM ("Premium Level"),
	VIP ("VIP Level");

	private String description;

	Level(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
