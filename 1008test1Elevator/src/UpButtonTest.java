import static org.junit.Assert.*;

import org.junit.Test;

public class UpButtonTest {

	@Test
	public void testPressButton() {
		//fail("Not yet implemented");
	}

	@Test
	public void buttonUpstatuscheckTest()  {
		UpButton upbutton = new UpButton();
		
		assertEquals(true,upbutton.buttonUpstatuscheck());
	}

	
	
}
