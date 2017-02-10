
public class GasTank {

	private double amount=0;

	//Creating a constructor with no parameters
	public GasTank(){
	}

	//Creating a constructor with a parameter
	public GasTank(double amount){
		this.amount=amount;
	}

	//Creating a method addGas - amount variable increased by addGas parameter
	public double addGas(double addGas){
		return this.amount+=addGas;
	}

	//Creating a method useGas - amount variable decreased by useGas parameter
	public double useGas(double useGas){
		return this.amount-=useGas;
	}

	//Getter method to return value of amount variable
	public double getGasLevel(){
		return this.amount;
	}

	//Setter method
	public double setAmount(double amount){
		return this.amount=amount;
	}

}

