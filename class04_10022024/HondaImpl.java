package class04_10022024;

public class HondaImpl implements CarsBasic, SafetyBasic{
	
	

	@Override
	public void increaseSpeed() {
		System.out.println("in the class HondaImpl increaseSpeed");
		
	}

	@Override
	public void decreaseSpeed() {
		System.out.println("in the class HondaImpl decreaseSpeed");
		
	}

	@Override
	public void checkGas() {
		System.out.println("in the class HondaImpl checkGas");
		
	}

	@Override
	public void fillGas() {
		System.out.println("in the class HondaImpl fillGas");
		
	}

	@Override
	public void airBags() {
		System.out.println("in the class HondaImpl airBags");
		
	}

	@Override
	public void sensorAlerts() {
		System.out.println("in the class HondaImpl sensorAlerts");
		
	}

}
