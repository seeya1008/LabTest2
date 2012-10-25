
public class Controller implements Subscriber {

	Model myModel = new Model();
	View myView = new View();
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\n Update of Controller\n");
	}
	
	public void initialise(Model newModel,View newView) {
		// TODO Auto-generated method stub
		
	}

}
