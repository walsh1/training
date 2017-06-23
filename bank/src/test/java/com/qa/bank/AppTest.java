package com.qa.bank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;


import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private CreditAccount creditAcc;
	
	@Before
	public void setUp() throws Exception {
		Mockery context = new JUnit4Mockery();
	    final BankAccount accountHandler = context.mock(BankAccount.class);
	    CreditAccount creditAcc = new CreditAccount(accountHandler);
	    context.checking(new Expectations(){
			{
				oneOf(accountHandler).getBalance();
				will(returnValue(0.00));
			}
			});
		System.out.println("Setup method is called");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Tear down method is called");
	}
    
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		//assertEquals(100,operator.add(80, 20));
		Double expectedResult = 0.00;
		double result = creditAcc.getBalance();
		assertEquals(expectedResult, result, 0.00);
			
		}
	
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
   /*
    *  public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    */

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
