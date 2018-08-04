package basic;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basicAnnotations extends Lannotation
{
	// test case 1
	   @Test(groups = {"rahul"})
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   // test case 2
	   @Test(groups = {"sathish"})
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }
	   
	   //test case 3
	   @Test(groups = {"sathish"})
	   public void testCase3() {
	      System.out.println("in test case 3");
	   }
	   
	 //test case 4
	   @Test(groups = {"sathish"})
	   public void testCase4() {
	      System.out.println("in test case 4");
	   }
	   
}
