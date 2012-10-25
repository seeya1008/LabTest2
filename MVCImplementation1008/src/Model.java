import java.util.ArrayList;


	public class Model {
	ArrayList<Subscriber> SubscriberSet = new ArrayList<Subscriber>();
	int someData;
	Subscriber subscribe;
	Model m;
	
	public void attachSubscriber(Subscriber newView)  {
		//m.add(newView);
	}
	
	public void detachObserver(Subscriber newView)  {
		
	}
	
	public void notifyObserver(Subscriber newView)  {
		subscribe.update();
	}
	
	public void getData(int myData)  {
		someData=myData;
	}
}
