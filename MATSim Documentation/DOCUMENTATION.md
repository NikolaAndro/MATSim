# MATSim 

A list of papers and other resources on MATSim in general, dispatcher, and mixed networks! Please don't hesitate to suggest resources in other subfields MATSim.

# Table of Contents
- MATSim book & Tutorials
- Vizualisation Tools
- Papers
  - MATSim in general
  - Mixed Traffic
  - Multimodal Traffic
  - Dispatcher
- Useful Links
  - General
  - Mixed Traffic
  - Multimodal Traffic
- Examples
- Other Resources

# MATSim book & Tutorials
  - [MATSim Book](https://www.matsim.org/the-book)
  - [MATSim Tutorial](https://www.simunto.com/matsim/tutorials/eifer2019/)
# Visualization Tools
  - [Via](https://www.simunto.com/via/)
  - OTFVis
# Papers
  
  ### Ride-sharing General
  - [Model Predictive Control of Ride-sharing Autonomous Mobility-on-Demand Systems](http://asl.stanford.edu/wp-content/papercite-data/pdf/Tsao.ea.ICRA19.pdf)
  - [Simulation and dynamic optimization of taxi services in MATSim](https://pdfs.semanticscholar.org/92df/69a3da030f1b9b1ecd16a032b28d014ab755.pdf)
  
  ### Ride-sharing Algorithms and Analysis
  - [Dynamic Ride Sharing Implementation and Analysis in MATSim](https://transp-or.epfl.ch/heart/2017/abstracts/hEART2017_paper_130.pdf)
  - [Routing autonomous vehicles in congested transportation networks: structural properties and coordination algorithms](http://asl.stanford.edu/wp-content/papercite-data/pdf/Rossi.Zhang.Hindy.Pavone.AURO17.pdf)
  - [Dynamic ride sharing implementation and analysis in MATSim](https://www.research-collection.ethz.ch/bitstream/handle/20.500.11850/183727/ab1285.pdf)
  - [Matching algorithm for improving ride-sharing by incorporating route splits and social factors](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0229674)
  - [DeepPool: Distributed Model-free Algorithm for Ride-sharing using Deep Reinforcement Learning](https://arxiv.org/pdf/1903.03882.pdf)
  - [A Reinforcement Learning Based Algorithm for Multi-hop Ride-sharing: Model-free Approach](https://ml4ad.github.io/files/papers/A%20Reinforcement%20Learning%20Based%20Algorithm%20for%20Multi-hop%20Ride-sharing:%20Model-free%20Approach.pdf)
  
  ### Dispatch
  - [A dynamic ridesharing dispatch and idle vehicle repositioning strategy with integrated transit transfers](https://www.sciencedirect.com/science/article/pii/S1366554518314790)
  - [Dynamic Trip-Vehicle Dispatch with Scheduled and On-Demand Requests](http://auai.org/uai2019/proceedings/papers/78.pdf)
  - [Order Dispatch in Price-aware Ridesharing](http://www.vldb.org/pvldb/vol11/p853-zheng.pdf)
  - [An Assignment-Based Approach to Efficient Real-Time City-Scale Taxi Dispatching](https://svn.vsp.tu-berlin.de/repos/public-svn/publications/vspwp/2016/16-12/IEEE_IS_taxi_simulation_hires.pdf)
  - [Design and Modeling of Real-Time Shared-Taxi Dispatch Algorithms](https://pdfs.semanticscholar.org/65a1/9bf678e034a9987a5ba9b17c1561afa0c7b8.pdf)
  
  ### Multi-modal Network
  - [Multimodal Network](https://www.semanticscholar.org/paper/A-Multi-Modal-Network-for-MATSim-Boesch-Ciari/cc450d395aaf535f71f20bac07db7ef2c027b785)
  
# Useful Links
  - General
    - [dtd files](http://www.matsim.org/files/dtd/): Document Type Description files (pgs. 43 & 61 in MATSim book)
    - [Extensions/Contribs](https://github.com/matsim-org/matsim-libs/tree/master/contribs): Extensions which enhance the functionality with additional features (mimght not be up to date)
    - [Extensions Link 2](https://github.com/matsim-org/matsim-libs/blob/master/contribs/README.md)
    - [Questions](https://github.com/matsim-org/matsim-code-examples/issues?q=is:issue): Here you can look up your problem and if not found, post a question
    - [Issue Tracker](https://matsim.atlassian.net/projects/MATSIM/issues/MATSIM-174?filter=allopenissues&orderby=priority%20DESC)
    - [Releases and release candidates](https://bintray.com/matsim/matsim/): Includes information how to use resources and release candidates by Maven, Gradle, or similar, also for contribs
  - Mixed Traffic
    - [Mixed traffic Requirements](https://matsim.atlassian.net/wiki/spaces/MATPUB/pages/84246576/Mixed+traffic): Required code for a mixed traffic implementation
    - [DynAgent class](https://www.matsim.org/apidocs/dvrp/12.0/org/matsim/contrib/dynagent/package-summary.html): Class used for dynamic agents
  - Multimodal Traffic
    - [Extentions for Multimodal Traffic](https://github.com/matsim-org/matsim-libs/tree/master/contribs/multimodal): This contrib enables multi-modal simulation. For a quickstart, confer to org.matsim.contrib.multimodal.RunMultimodalExample.
    
# Other Resources
  - [Maven Repository](https://mvnrepository.com/artifact/org.matsim/matsim-examples/12.0-2019w45-SBB): Dependency for MATSim Examples
  - [Jankins Repository](http://ci.matsim.org:8080/): Upstream and Downstream Projects
  - [MATSim Documentation](https://www.matsim.org/gallery/): Link to the MATSim Website documentation
  - [Converter to .gz file](https://online-converting.com/archives/convert-to-gzip/)

# Examples
  - [Get Started Example](https://github.com/matsim-org/matsim-example-project): An example how to get started with your own project, including a complete pom.xml
  - [Scenario Gallery](https://www.matsim.org/gallery/): Good to visualize different scenarios
  - [drt_examples - taxi](https://github.com/matsim-org/matsim-maas): Polish city Mielec and German city Cottbus are used
  - [equil - mixed_traffic](https://github.com/matsim-org/matsim-libs/tree/master/examples/scenarios/equil-mixedTraffic): Used cars and bicycles for mixed traffic
  - [different scenarios](https://github.com/matsim-org/matsim-libs/tree/master/examples/scenarios)
  - [matsim-code-examples](https://github.com/matsim-org/matsim-code-examples): Kai Nagel's Examples
  - [multimdoal_config](https://github.com/matsim-org/matsim-libs/blob/master/contribs/multimodal/src/test/resources/test/input/org/matsim/contrib/multimodal/MultiModalControlerListenerTest/config_berlin_multimodal.xml)
  - [Mixed traffic config](https://github.com/matsim-org/matsim-libs/blob/master/examples/scenarios/equil-mixedTraffic/config-with-mode-vehicles.xml)
  - [Creating Taxis in code example](https://github.com/matsim-org/matsim-libs/blob/master/contribs/av/src/main/java/org/matsim/contrib/av/robotaxi/vehicles/CreateTaxiVehicles.java)

# Data Sets
  - [UCI Machine Learning](https://archive.ics.uci.edu/ml/index.php)
  - [NYC Open Data](https://opendata.cityofnewyork.us/)
  - [Chicago Data Portal](https://data.cityofchicago.org/)
# YouTube links
  - [MATSim Singapore](https://www.youtube.com/watch?v=_N6Z1_yWQf4)
  
  
