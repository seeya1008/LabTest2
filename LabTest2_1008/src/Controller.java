import java.util.ArrayList;




public class Controller implements Observer{

	Publisher modelpublish;
	View myView;
	Elevator elev;
	
	ElevatorPanel ep;
	int curPos;
	ArrayList<Floor> floors=new ArrayList<Floor>();
	ArrayList<Request> requests=new ArrayList<Request>();
	ElevatorState elavatorState;
	
	
	@Override
	public void setElevatorPosition(int pos) {
		// TODO Auto-generated method stub
		
	}
	
	public void initialise(Publisher modelpublish,View yView)  {
		
	}
	
	
	public void processDoorFunctioning()
	{
		//Opening and Closing Elevator and floor doors..
		elev.getDoor().openDoor();
		
		elev.getDoor().closeDoor();
	}
	
	public void changeState(ElevatorState eState) {
		this.elavatorState=eState;
	
	}
	
	
	public void handleRequest()
	{
		while(elev.getRequests().size()!=0)
		{
			elev.move();
			elev.setButtonStatusOff();
			
			System.out.println("Reached to Floor No: " + elev.getCurPos());	
			elev.removeRequest();
			
			elev.getElevatorPanel().getLED().changeDirection(Direction.STATIONARY);
			
			elev.idle(); //Elevator Idle State.
			
			processDoorFunctioning();			
		}
	}
	
}
