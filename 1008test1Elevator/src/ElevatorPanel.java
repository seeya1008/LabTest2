import java.util.ArrayList;


public class ElevatorPanel {
	
	ArrayList<Button> buttons = new ArrayList<Button>();
	
	public boolean buttonpress()  {
		boolean buttonStatus = true;
		
		return buttonStatus;
	}
	
	public boolean checkstatus()  {
		boolean status;
			if(buttonpress()==true)
				status =true;
			else
				status = false;
		
		return status;
	}
	
	
}
