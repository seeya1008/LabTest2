
public class UpButton extends FloorButton{

		/*void pressButton()  {
			System.out.println("Button UP pressed!!");
		}*/
	ElevatorPanel elevator;
	
	 boolean pressButton()  {
		//System.out.println("Button pressed!");
		boolean stat;
		 stat=buttonUpstatuscheck();
		 
		 return stat;
	}
		
		boolean buttonUpstatuscheck()  {
			boolean status;
			status=elevator.checkstatus();
			
			return status;
		}
		
		
}
