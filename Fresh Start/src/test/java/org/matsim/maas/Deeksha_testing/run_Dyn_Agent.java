package org.matsim.maas.Deeksha_testing;

/**
 * 
 *  Programmers: Nikola Andric
 *  Date: 11/16/2021
 * 
 */
import java.net.URL;

import org.junit.Test;
import org.matsim.core.utils.io.IOUtils;
import org.matsim.examples.ExamplesUtils;

public class run_Dyn_Agent {
	@Test
	public void testRun() {
		URL networkUrl = IOUtils.extendUrl(ExamplesUtils.getTestScenarioURL("dvrp-grid"), "config.xml");
		runDynAgent.run(networkUrl, "grid_network.xml", false);
	}
}

