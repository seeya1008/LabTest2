
public class UpButton extends FloorButton{

		/*void pressButton()  {
			System.out.println("Button UP pressed!!");
		}*/
	ElevatorPanel elevator;
	
	 boolean pressButton()  {
		
		boolean stat;
		
		stat=pushbutton();
		return stat;
		 
		 
	}
	 
	 
		
		boolean buttonUpstatuscheck()  {
			boolean status;
			status=elevator.checkstatus();
			
			return status;
		}
		
		boolean goneup()  {
			return true;
		}
		
}
