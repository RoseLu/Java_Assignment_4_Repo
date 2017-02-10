import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	private String customerId;
	
	//Creating the constructors for the Customer class
	public Customer(String customerName,String customerId){
		this.customerName=customerName;
		this.customerId=customerId;
	}
	
	//Setting the mutator methods
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	
	public void setcustomerId(String customerId){
		this.customerId=customerId;
	}
	
	//Creating the accessor methods
		public String getCustomerName(){
			return customerName;
		}
		
		public String getcustomerId(){
			return customerId;
		}
	
	//Create an arraylist to store thr price of books
	ArrayList<Double> numBooks  = new ArrayList<Double>();
	
	//Keep adding the prices of the books purchased by the customer
	public void addBooks(Book book) {	
		numBooks.add(book.getPrice());
		}
		
	//To get the total price of the books purchased
	public double getTotalBookPrice(){
		double sum = 0;
		for(double i :numBooks){
			sum+=i;
		}
		System.out.println("Total price of the books that the customer "+customerName +" bought : " +sum);
		return sum;
	}
}
