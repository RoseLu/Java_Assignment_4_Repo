
public class Book {
	
	//Declaring the variables as private
	private String bookTitle;
	private double price;
	
	//Creating a constructor for the Book class
	public Book(String bookTitle,double price){
		this.bookTitle=bookTitle;
		this.price=price;
	}
	
	//Setting the mutator methods
	public void setBookTitle(String bookTitle){
		this.bookTitle=bookTitle;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	//Creating the accessor methods
		public String getBookTitle(){
			return bookTitle;
		}
		
		public double getPrice(){
			return price;
		}
		
	
}
