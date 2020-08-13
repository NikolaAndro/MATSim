/********************************************
 * 											*
 * Programmer: 		Nikola Andric			*
 * Date: 			June 3rd 2020			*
 * Email: 			dzonikika@yahoo.com		*
 * 											*
 * ******************************************
 * 
 *  This program is implemented in order to
 *  have a dynamic agent that can be 
 *  controlled by a controller used by a 
 *  dispatch. Agent will have the ability to
 *  change his/her movement plan when 
 *  receives information from the dispatch.	
 * 
 ************************************/
//for the dynAgent we created a package where we will do testing
package org.matsim.contrib.dynagent;

//import org.matsim.contrib.dynagent.run.;
import org.matsim.contrib.dvrp.run.DvrpConfigGroup;
//importing the RunOneTaxiExample in order to demonstrate to ourselves how this works.
import org.matsim.contrib.dynagent.*;
//import org.matsim.contrib.taxi.run.MultiModeTaxiConfigGroup;
import org.matsim.core.config.Config;  //The configuration can be used to change the behavior of MATSim in some well-defined places.
										
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler; //The Controler is responsible for complete simulation runs, including the initialization 
											//of all required data, running the iterations and the replanning, analyses, etc.
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.vis.otfvis.OTFVisConfigGroup;
import org.matsim.api.core.v01.Scenario;


public class DynamicAgents{
	
	private static final String EQUIL_CONFIG = "scenarios/equil/config.xml";
	
	public static void run() {
		
		//Since the scenario is "built" through the config, I need to add the dynamic agent
		//DynAgent Nikola = new DynAgent();
		
		
		//need to create a config file for this class and input it as a first parameter.
		//config stores all configuration settings specified in a configuration file and PROVIDES ACCESS TO THE SETTINGS AT THE RUN TIME.
		
		//loadConfig (hopefully) overwrites config settings if they are defined in the file.
		Config config = ConfigUtils.loadConfig(EQUIL_CONFIG, new DvrpConfigGroup(), new DvrpConfigGroup(),new OTFVisConfigGroup());
		
		//Assumption: Setting the number of iterations.
		config.controler().setLastIteration(10);
		
		// load scenario
		//LoadScenario populates a scenario with data read from the input files which are named in the config which is wrapped in the scenario.
		//static void	ScenarioUtils.loadScenario(Scenario scenario)
		
		//static Scenario	ScenarioUtils.loadScenario(Config config)
        //Initializes a scenario and populates it with data read from the input files which are named in the config.
		Scenario scenario = ScenarioUtils.loadScenario(config);
		
		
		// setup controler
		Controler controler = new Controler(scenario);
		
		
		// run simulation
		controler.run();
		//RunOneTaxiExample.run("C:\\Users\\Admin\Desktop\\Java Programming\\MATSim\\matsim-0.10.1\\matsim-0.10.1\\examples\\equil\\config.xml",true);
    }
	
	public static void main(String[] args) {
		//DynAgent Nikola = new DynAgent();
		
		DynamicAgents.run();
		 
	}
	
}


