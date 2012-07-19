
public class UpButton extends FloorButton{

		/*void pressButton()  {
			System.out.println("Button UP pressed!!");
		}*/
	ElevatorPanel elevator;
	
	public boolean pressButton()  {
		//System.out.println("Button pressed!");
		boolean stat;
		return stat=buttonUpstatuscheck();
	}
		
		boolean buttonUpstatuscheck()  {
			boolean status;
			status=elevator.checkstatus();
			
			return status;
		}
}
