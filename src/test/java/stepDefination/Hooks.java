package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	
	@BeforeAll
	public static void before_all() {
		
		System.out.println("@beforeAll- close DB connection");
		
	}
	
	
	@AfterAll
	public static void after_all() {
		
		System.out.println("@AfterAll- close DB connection");
	}
	
	
	@Before
	public void setup() {
		System.out.println("@before hook-launching browser");
		
	}
	
	@After
	public  void teardown() {
		System.out.println("@before hook-to quit the browser");

		
	}
	
	@BeforeStep
	public void before_step() {
		System.out.println("Before step - adding a log");
		
	}
	@AfterStep
	public void after_step() {
		
		System.out.println("After_step - deleting the log");
	}
}
