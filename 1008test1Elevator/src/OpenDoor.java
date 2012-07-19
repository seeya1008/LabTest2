
public class OpenDoor extends Door{

	
	
	ElevatorPanel elvP;
	Elevator elevate;
	CloseDoor close;
	UpButton upbutton;
	
	public String doorstatus(String input)  {
		
		return input;
	}
	
	void opendoor()  {
		System.out.println("Door is OPEN!!	");
		
	}
	
	public boolean checkopendoor()  {
		//boolean status = true;
		
		/*if(elvP.checkstatus()==true)  {
			//opendoor();
			return true;
		}
		else
			//close.closedoor();
			return false;
	}*/
	
		if(upbutton.pressButton()==true)
			elevate.callElevator();
		return false;
	
}
	
}
