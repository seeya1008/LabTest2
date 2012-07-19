
public class OperatorLiftFacade {

	UpButton upbutton = new UpButton();
	OpenDoor opendoor;
	CloseDoor closedoor;
	Elevator elev;
	
	void checkbutton()  {
		upbutton.pressButton();
		opendoor.opendoor();
		closedoor.closedoor();
		
	}
	
	
}
