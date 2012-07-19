import static org.junit.Assert.*;

import org.junit.Test;


public class CloseDoorTest {

	@Test
	public void operateDoorTest() {
		
		CloseDoor closedoor = new CloseDoor();
		closedoor.closedoor();
	}
	
	@Test
	public void checkclosedoorTest()  {
		CloseDoor closedoor = new CloseDoor();
		
		assertEquals(true,closedoor.checkclosedoor());
	}
}
