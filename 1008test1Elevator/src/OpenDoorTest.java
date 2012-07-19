import static org.junit.Assert.*;

import org.junit.Test;


public class OpenDoorTest {

		
	@Test
	public void operateDoorTest() {
		OpenDoor opendoor = new OpenDoor();
		opendoor.opendoor();
		
		
	}
	
	
	/*@Test
	public void checkopendoorTest()  {
		OpenDoor opendoor = new OpenDoor();
		
		assertEquals(true,opendoor.checkopendoor());
	}*/
	
	@Test
	public void checkopendoorTest()  {
		//boolean status = true;
		
		OpenDoor checkdoor = new OpenDoor();
		
		assertEquals(true,checkdoor.checkopendoor());
			
	}
	

}
