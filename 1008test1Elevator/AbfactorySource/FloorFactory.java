
public class FloorFactory implements ElevatorPartFactory {

	@Override
	public ElevatorPart createtElevatorPart() {
		// TODO Auto-generated method stub
		return new Floor();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new FloorDoor();
	}

}
