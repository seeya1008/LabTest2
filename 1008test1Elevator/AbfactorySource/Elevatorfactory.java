
public class Elevatorfactory implements ElevatorPartFactory {

	@Override
	public ElevatorPart createtElevatorPart() {
		// TODO Auto-generated method stub
		return new ElevatorTrolley();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new ElevatorDoor();
	}

}
