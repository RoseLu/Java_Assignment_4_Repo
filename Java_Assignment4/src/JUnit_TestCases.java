
import org.junit.Assert;
import org.junit.Test;


public class JUnit_TestCases {

	@Test
	//Tests for Student class
	public void testStudent() {
		Student std = new Student();
		std.setStudentName("Nancy");
		Assert.assertEquals("Nancy", std.getStudentName());
		std.setStudentId("A345678Y");
		Assert.assertEquals("A345678Y", std.getStudentId());
	}

	@Test
	//Tests for Course class
	public void testCourse(){
		Course cs = new Course();
		cs.setCourseName("Information Technology");
		Assert.assertEquals("Information Technology", cs.getCourseName());
		cs.setnumberOfStudents(12);
		Assert.assertEquals(12, cs.getNumberOfStudent());
		cs.setnumberOfStudents(15);
		Assert.assertEquals(true, cs.isFull());
	}

	@Test
	//Tests for Book class
	public void testBook(){
		Book bk = new Book("Java Tutorial",25.20);
		Assert.assertEquals("Java Tutorial", bk.getBookTitle());
		Assert.assertEquals(25.20, bk.getPrice(),0.01);
	}

	@Test
	//Tests for Customer class
	public void testCustomer(){
		Customer ct = new Customer("Prince","C234516");
		Assert.assertEquals("Prince", ct.getCustomerName());
		Assert.assertEquals("C234516", ct.getcustomerId());
	} 

	@Test
	//Tests for Car class
	public void testCar(){
		Car myCar = new Car("Honda-Accord",2016,55.50,"Kona Coffee");
		Assert.assertEquals("Honda-Accord", myCar.getModel());
		Assert.assertEquals(2016, myCar.getYear());
		Assert.assertEquals(55.50, myCar.getSpeed(),0.01);
		Assert.assertEquals("Kona Coffee", myCar.getcolour());	
	}
	@Test
	//Tests for GasTank class
	public void testGasTank(){
		GasTank gas = new GasTank(20);
		gas.setAmount(30);
		Assert.assertEquals(30, gas.getGasLevel(),0.01);
		gas.useGas(10);
		gas.addGas(40);
		Assert.assertEquals(60, gas.getGasLevel(),0.01);
	}

	@Test
	//Tests for Driver class
	public void testDriver(){
		Driver drive = new Driver();
		Assert.assertTrue(drive.drive());
	}
}

