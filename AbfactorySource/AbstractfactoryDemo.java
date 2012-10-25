
public class AbstractfactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevatorPartFactory elvFactory = new Elevatorfactory();
		ElevatorPart elevator = elvFactory.createtElevatorPart();
		IDoor elvDoor=elvFactory.createDoor();
		
		ElevatorPartFactory elvFactory2 = new FloorFactory();
		ElevatorPart floor = elvFactory2.createtElevatorPart();
		IDoor floorDoor=elvFactory2.createDoor();

	}

}
