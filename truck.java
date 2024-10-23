package database1;

public class truck extends vehicle {
	private int loadCapacity;
	private boolean isFourWheelDrive;
	private String cargoType;
	
	public truck(double make,String model,int year,double rentalRate,int loadCapacity,boolean isFourWheelDrive,String cargoType) {
		super(make,model,year,rentalRate);
		this.loadCapacity = loadCapacity;
		this.isFourWheelDrive = isFourWheelDrive;
		this.cargoType = cargoType;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("load capacity:"+loadCapacity);
		System.out.println("fourWheelDrive:"+isFourWheelDrive);
		System.out.println("cargoType:"+cargoType);
	}

}
