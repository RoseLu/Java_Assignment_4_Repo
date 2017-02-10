
public class Car {

	private String model;
	private int year;
	private double speed;
	private String colour;

	//Creating a constructor for the class
	public Car(String model,int year,double speed,String colour){
		this.model=model;
		this.year=year;
		this.speed=speed;
		this.colour=colour;	
	}

	//Creating an empty Car constructor (in case it is needed)
	public Car(){
	}

	//Setter(mutator) methods
	public void setModel(String model){
		this.model=model;
	}

	public void setYear(int modelYear){
		year=modelYear;
	}

	public void setSpeed(double speed){
		this.speed=speed;
	}

	public void setColour(String colour){
		this.colour=colour;
	}

	//Getter(accessor) methods
	public String getModel(){
		return model;
	}

	public int getYear(){
		return year;
	}

	public double getSpeed(){
		return speed;
	}

	public String getcolour(){
		return colour;
	}
}
