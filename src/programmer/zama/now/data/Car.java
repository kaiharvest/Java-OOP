package programmer.zama.now.data;

import programmer.zama.now.Anotation.Fancy;

@Fancy(name = "AnimalaApp", tag = {"aplication", "java"})

public interface Car extends HasBrand, isMaintenance {



	void drive();
	int getTier();

	default boolean isBig() {
		return false;
	};
}
