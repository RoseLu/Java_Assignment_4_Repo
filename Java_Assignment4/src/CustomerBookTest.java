
public class CustomerBookTest {

	public static void main(String[] args) {
		
		//Creating objects for the classes and passing values to constructors
		Book bk1 = new Book("Harry Potter",45);
		Book bk2 = new Book("The Diary Of a Young Girl-Anne Frank",20);
		Book bk3 = new Book("To Kill A Mocking Bird",30);
		Book bk4 = new Book("Twilight",20.50);
		Book bk5 = new Book("Life Of Pie",15.50);
		Customer cs = new Customer("John","A12345");
		Customer cs1 = new Customer("Sunny","B9876");
		
		//Checking the getter methods
		System.out.print("Customer "+cs.getCustomerName() +" bought the books: ");
		System.out.println(bk1.getBookTitle() +" , " +bk2.getBookTitle() +" , " +bk3.getBookTitle());
		System.out.println();
		
		//Checking the setter methods
		System.out.println("***Setting a different customer***");
		cs.setCustomerName("Mary");
		System.out.print("Customer "+cs.getCustomerName() +" bought the books: ");
		System.out.println(bk4.getBookTitle() +" , " +bk5.getBookTitle());
		System.out.println();

		//The price of books could be added this way(but it is easier to create methods which is done below
		System.out.println("***One way of adding the prices***");
		System.out.println("Total price of the books that " +cs.getCustomerName() +" bought : " +(bk4.getPrice()+bk5.getPrice()));
		System.out.println();
		
		//Checking the addBooks method to add the prices of books which is easier than the above method
		System.out.println("***Adding prices by making use of methods***");
		cs.addBooks(bk4);
		cs.addBooks(bk5);
		cs1.addBooks(bk1);
		cs1.addBooks(bk2);
		cs1.addBooks(bk3);
		
		//Getting the total price of the books
		cs.getTotalBookPrice();
		cs1.getTotalBookPrice();		
	}

}
