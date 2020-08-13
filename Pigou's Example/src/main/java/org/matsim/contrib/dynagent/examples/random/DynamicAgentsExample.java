/********************************************
 * 											*
 * Programmer: 		Nikola Andric			*
 * Date: 			June 9th 2020			*
 * Email: 			dzonikika@yahoo.com		*
 * 											*
 * ******************************************
 * 
 *  This program is implemented in order to
 *  have a dynamic agent example that can be 
 *  controlled by a controller used by a 
 *  dispatch. Agent will have the ability to
 *  change his/her movement plan when 
 *  receives information from the dispatch.	
 * 
 ************************************/
// package needed for the dynagent example
package org.matsim.contrib.dynagent.examples.random;

//import org.matsim.contrib.dynagent.examples.random.*;

public class DynamicAgentsExample{
	
	public static void main(String[] args) {
		//DynAgent Nikola = new DynAgent();
		//testDynAgent();
		
		//this should initialize the starting time of the random activity
		 RandomDynActivity first_random_activity = new RandomDynActivity(9.22);
		 
		 
		 //this would execute the simulation at the time 9.22
		 first_random_activity.doSimStep(9.22);
		 
		 
		 
		 
		 
	}
	public static void testDynAgent() {
		//RandomDynActivity(5.33);
		//need to create a config file for this class and input it as a first parameter.
		//RunOneTaxiExample.run("C:\\Users\\Admin\Desktop\\Java Programming\\MATSim\\matsim-0.10.1\\matsim-0.10.1\\examples\\equil\\config.xml",true);
    }

	
}