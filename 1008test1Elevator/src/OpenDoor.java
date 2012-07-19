
public class OpenDoor extends Door{

	private static final String String = null;
	
	ElevatorPanel elv;
	CloseDoor close;
	
	public String doorstatus(String input)  {
		
		return input;
	}
	
	void opendoor()  {
		System.out.println("Door is OPEN!!	");
		
	}
	
	public boolean checkopendoor()  {
		//boolean status = true;
		
		if(elv.checkstatus()==true)  {
			//opendoor();
			return true;
		}
		else
			//close.closedoor();
			return false;
	}
	
	
	
}
