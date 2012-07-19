
public class DownButton extends FloorButton{
	
	
	DownButton(String res) {
		super(res);
		// TODO Auto-generated constructor stub
	}


	ElevatorPanel elevator;
	/*boolean buttonDownstatuscheck()  {
		
		boolean status = true;
		
		return status;
	}*/
	
	//***************************************************************************
	//***************************************************************************
	
	
	
	 void pressButton()  {
		//System.out.println("Button pressed!");
		boolean stat;
		 stat=buttonDownstatuscheck();
		 
		 //return stat;
	}
		
		boolean buttonDownstatuscheck()  {
			boolean status;
			status=elevator.checkstatus();
			
			return status;
		}
		
		
		boolean gonedown()  {
			return true;
		}

}
