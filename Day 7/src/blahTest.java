import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class blahTest {

	private blah operator;
	
	@Before
	public void setUp() throws Exception {
		operator = new blah();
		System.out.println("Setup mathod is called");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Tear down method is called");
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		assertEquals(100,operator.add(80, 20));
	}
	
	@Test
	public void testDoStuff(){
		assertEquals("i dont care",operator.doStuff());
	}

}
