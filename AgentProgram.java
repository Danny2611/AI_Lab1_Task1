package Lab1_Task1;

import Lab1_Task1.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		//TODO
//		return NoOpAction.NO_OP;
		
		if( p.getLocationState() == LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
		}else
			if ( p.getAgentLocation() == Environment.LOCATION_A) {
				return Environment.MOVE_RIGHT;
			}
			else 
				return Environment.MOVE_LEFT;
		
	}
}