/*
 * *********************************************************************** *
 * project: org.matsim.*
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2019 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** *
 */

package org.matsim.maas;

import org.matsim.api.core.v01.Scenario;
import org.matsim.contrib.drt.run.DrtControlerCreator;
import org.matsim.contrib.drt.run.MultiModeDrtConfigGroup;
import org.matsim.contrib.drt.run.MultiModeDrtModule;
import org.matsim.contrib.dvrp.run.DvrpConfigGroup;
import org.matsim.contrib.dvrp.run.DvrpModule;
import org.matsim.contrib.dvrp.run.DvrpQSimComponents;
import org.matsim.contrib.otfvis.OTFVisLiveModule;
import org.matsim.contrib.taxi.run.MultiModeTaxiConfigGroup;
import org.matsim.contrib.taxi.run.MultiModeTaxiModule;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.vis.otfvis.OTFVisConfigGroup;

/**
 * @author Michal Maciejewski (michalm)
 */
public class RunMaas {
	public static void main(String[] args) {
		run(args[0], false);
	}

	public static void run(String configFile, boolean otfvis) {
		Config config = ConfigUtils.loadConfig(configFile, new MultiModeDrtConfigGroup(),
				new MultiModeTaxiConfigGroup(), new DvrpConfigGroup(), new OTFVisConfigGroup());
		Scenario scenario = DrtControlerCreator.createScenarioWithDrtRouteFactory(config);
		ScenarioUtils.loadScenario(scenario);
		config.controler()
				.setOverwriteFileSetting(OutputDirectoryHierarchy.OverwriteFileSetting.overwriteExistingFiles);
		Controler controler = new Controler(scenario);
		controler.addOverridingModule(new MultiModeDrtModule());
		controler.addOverridingModule(new MultiModeTaxiModule());

		controler.addOverridingModule(new DvrpModule());
		controler.configureQSimComponents(DvrpQSimComponents.activateAllModes(MultiModeTaxiConfigGroup.get(config),
				MultiModeDrtConfigGroup.get(config)));

		if (otfvis) {
			controler.addOverridingModule(new OTFVisLiveModule());
		}

		controler.run();
	}
}
