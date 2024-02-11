package class04_10022024;

public interface CarsBasic {
	
	public void increaseSpeed();
	public void decreaseSpeed();
	public void checkGas();
	public void fillGas();
	default void dummy() {
	}

}
