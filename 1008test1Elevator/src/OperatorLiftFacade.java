
public class OperatorLiftFacade {

	UpButton upbutton = new UpButton();
	OpenDoor opendoor;
	CloseDoor closedoor;
	Elevator elev;
	
	void checkbutton()  {
		elev.elevatormove();
		
		upbutton.pressButton();
		opendoor.opendoor();
		opendoor.checkopendoor();
		closedoor.checkclosedoor();
		closedoor.closedoor();
		upbutton.pressButton();
		elev.elevatormove();
	
		
		

		
	}
	
	
}
