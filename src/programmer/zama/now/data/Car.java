package programmer.zama.now.data;

public interface Car extends HasBrand, isMaintenance {
	void drive();
	int getTier();

	default boolean isBig() {
		return false;
	};
}
