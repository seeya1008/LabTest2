import java.util.ArrayList;


public class Building {

	
		
		ArrayList<Floor>floors = new ArrayList<Floor>();
		
		void addfloor()  {
		for(int i=0;i<20;i++)  {
			floors.add(new Floor(i));
		}
		
		}	
		
		
		
		
}
