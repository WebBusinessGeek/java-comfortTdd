import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComfortClassTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testItShouldReturnHello() {
		ComfortClass comfortclass = new ComfortClass();
		String response = comfortclass.sayHello();
		assertEquals("hello", response);
	}
	
	@Test
	public void testItShouldReturnAge() {
		ComfortClass comfortclass = new ComfortClass();
		int response = comfortclass.getAge();
		assertEquals(2, response);
	}
	

}
