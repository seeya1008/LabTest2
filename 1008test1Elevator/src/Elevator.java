
public class Elevator {

	//OperatorLiftFacade lift;
	
	//lift.checkbutton();
	
	ElevatorPanel elvpanel;
	Door doors;
	boolean direction;
	
	void elevatormove()  {
		
		if(elvpanel.buttonpress()==true)
		{
			if(getdirection()==true)
			
				System.out.println("Elevator moving up");
			else
				System.out.println("Elevator moving down");
			
		}
	
	}
	
	boolean getdirection()  {
		//up=true ; down = false;
		
		boolean direction = false;
		
		if(direction==true)
			return true;
		else
			return false;
		
	}
	
}
