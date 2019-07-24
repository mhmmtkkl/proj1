package State;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StateScript {

	private ArrayList<String> States = new ArrayList<>();
	
	public StateScript(ArrayList<String> MyStates) {
		if(States!=null)
		this.States = MyStates;
	}
	
	public ArrayList<String> getStates(){
		
		return States;
	}
	
	public void setStates(ArrayList<String> MyStates) {
		
		this.States = MyStates;
		
	}
	
	//----------------------------------------------------
	
	//Start from here
	
//	add oneStates to States ArrayList 
	@Test
	public void AddStates (String oneState) {
		
		States.add("oneState");
		
		
		
	 
		
	}
	
//	Set third state oneStates 1 - 3 -5 -7 - 9 -11
	@Test
	public ArrayList<String> SetStates (String oneState) {
	 for (int i = 0; i < States.size(); i=i+2) {
		 
		 
		
	}
		
		
		 
		return States;
}

//  Count of the myState if there is no any myState in the list return 0
	public int countOfState(String myState) {
      
		for (int i = 0; i < States.size(); i++) {
    	  if (States.get(i).equalsIgnoreCase(myState)) {
    		
		}
	}
		
		return 0;
		 
	}
	

//	remove the myState from the States arrayList
public ArrayList<String> RemoveTheState(String myState) {
		 for (int i = 0; i < States.size(); i++) {
			 if (States.get(i).equals(myState)) {
				States.remove(myState);
			}
			
		}
		
		return States;
		 
	}

//if the state duplicated remove duplicated states
public ArrayList<String> RemoveDuplicatedStates(){
	
	for (int i = 0; i < States.size(); i++) {
		for (int j = 0; j < States.size(); j++) {
			if (States.get(i)) {
				
			}
			
		}
		
	}

	
	return States;
}

// if firstState is exist replace it with secondState
public ArrayList<String> replaceStateWithOtherState(String FirstState, String SecontState){
	
	
	
	
	return States;
	
}
	
}
