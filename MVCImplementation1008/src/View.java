
public class View implements Subscriber {

	Model myModel = new Model();
	View view;
	Controller control = new Controller();
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\n Update of View\n");
	}
	
	public void initialise(Model newModel) {
		// TODO Auto-generated method stub
		view.makeController();
		control.initialise(newModel,view);
	}
	
	public void makeController()  {
		System.out.println("\n Calls itself\n");
	}

}
