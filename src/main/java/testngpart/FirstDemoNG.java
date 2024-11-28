package testngpart;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstDemoNG {
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("I m a BeforeTest annotation");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I m a before method");
	}
	@Test(priority=2)
	public void timeOfBatch()
	{
		System.out.println("i m a timeOfBatch from Test annotation");
		org.testng.Assert.assertTrue(((3-1)-(1+1)==0), "I am a failed method of TestNG demo class");
		
	}
	@Test(priority=3)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("i m a sum method from Test annotation");
	}
	@Test(priority=1)
	public void subraction()
	{
		System.out.println("I m a priority 1");
	}
	@AfterTest
	public void lastMethod()
	{
		System.out.println("I m a After test annotation");
	}

}
