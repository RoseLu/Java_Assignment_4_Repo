
public class DriverTest {

	//Creating Car and GasTank objects. It is declared static so that all the methods of this class can access it
	static Car myCar = new Car("Honda",2017,55,"Kona Coffee");
	static GasTank gas = new GasTank(50);

	//Creating a drive() method which specifies the rules for one to drive a car
	public boolean drive(){
		if(myCar.getModel().equals("Honda") && gas.getGasLevel()>10){
			System.out.println("Yes! You can drive the car");
			return true;
		}
		else
			System.out.println("No! You cannot drive the car because the specifications are not met");
		return false;
	}

	//Creating a method addGas to check if a car has enough fuel to drive
	public void addGas(){
		if(gas.getGasLevel()>10){
			System.out.println("There is enough fuel to drive the car");
		}
		else{
			System.out.println("You cannot drive the car. Fuel is less than 10gallons. Add more fuel.");
			gas.addGas(10);
		}
	}

	public static void main(String[] args) {

		//Checking the Car class getter and setter methods
		System.out.println("The model of the car is " +myCar.getModel() +" and colour is " +myCar.getcolour());
		System.out.println();
		System.out.println("***After setting the colour to a different one***");
		myCar.setColour("Black");
		System.out.println("The colour is now changed to " +myCar.getcolour());

		//Checking the GasTank class methods
		System.out.println();
		System.out.println("***Checking all the methods in GasTank class***");
		gas.setAmount(40.50);
		gas.useGas(30);
		gas.addGas(20);	
		System.out.println("The current gas level is "+gas.getGasLevel());
		System.out.println();

		//Checking the DriverTest class method - drive()
		DriverTest dr = new DriverTest();	
		gas.setAmount(10);
		myCar.setModel("BMW");
		System.out.println("Can the driver drive the car? ");
		dr.drive();
		System.out.println();

		//Checking the DriverTest class method - drive()
		gas.setAmount(45);
		myCar.setModel("Honda");
		System.out.println("***After setting more fuel in the car and setting the correct model of the car***");
		System.out.println("Can the driver drive the car? ");
		dr.drive();
		System.out.println();

		//Checking the DriverTest class method - addGas()
		gas.setAmount(2);
		System.out.println("Is there fuel to drive the car? ");
		dr.addGas();
		System.out.println();
		System.out.println("***Added some more fuel in the car through the addgas method because of less fuel***");
		System.out.println("Now the gas level is " +gas.getGasLevel());
		System.out.println();
		System.out.println("***Calling the method again***");
		dr.addGas();
	}


}
