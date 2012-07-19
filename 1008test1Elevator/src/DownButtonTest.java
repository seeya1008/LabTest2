import static org.junit.Assert.*;

import org.junit.Test;


public class DownButtonTest {

	@Test
	public void testPressButton() {
		//il("Not yet implemented");
	}

	@Test
	public void buttonDownstatuscheckTest()  {
		DownButton downbutton = new DownButton();
		
		assertEquals(true,downbutton.buttonDownstatuscheck());
	}

}
