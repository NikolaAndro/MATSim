# MATSim(Multi-Agent Transport Simulation)

This repository contains MATSim documentation and MATSim examples.

Pegou Example is being implemented in order to test a mixed network of ride-sharing vehicles and regular vehicles (cars, bikes...).
(In progress)


# Starting With Matsim

1. MATSim is a software written in Java.Therefore, you will need to install [Java SE (Standard Edition)](https://www.oracle.com/java/technologies/javase-downloads.html#JDK15). Currently, Java SE 11 is compatible with MATSim. Then, you will want to have Eclipse IDE (as the most recommending IDE, for executing MATSim code). 

2. MATSim has its own GUI. However, it is not necessary and I, personally, did not use it in my research. MATSim code can be ran in Eclipse and it will produce necessary output files. 

    - To start, you can clone any of the MATSim repositories online to a local repository where you will store MATSim examples. For my research, I cloned the second of the two repositories below. 
        - Suggested repositories: 
          - [Kai Nagel's example repo](https://github.com/matsim-org/matsim-example-project)
          - [Michal Maciejewski' repo](https://github.com/matsim-org/matsim-maas)

3. Import as maven project into Eclipse IDE (or other if you prefer). Maven will sort out the dependencies. No need to download the MATSim main repository. Sources are available.
    - Eclipse: Import … –> … as maven project –> browse to dir –> accept, accept, accept
       
4. Program is ready to be executed.

# Testing

When running test files do the following:
   
   1. Right click on testing package
   2. Run as
   3. Run configuration
   4. Select JUnit on the left hand side frop menu
   5. Select Run all tests in the selected project, package or source folder
   6. Search button
   7. Select the src/test/java folder
   8. Select the test you want to run
   9. OK
   10. Test Runner: JUnit 4  (@Test in the test file is being used. Otherwise, you can execute it with JUnit 3 as well)

# Visualizing 

5. For visualization of the results, I used software called Via. Via requires a licence that can be gotten for free after providing the name of your institution that you are using Via for. Via software, as well as its manual and sample data can be downloaded [here](https://www.simunto.com/via/download).

6. Once you download and run Via, you will be asked to provide the licence. If you have not gotten one yet, click the button in the bottom right corner "Get a licence online..." that will take you to a website to get the licence.
    - NOTE: When entering Organization name when filling out necessary information, I suggest not having '&' in the name of the organization since it will stop you from receiving the licence. 

7. The licence will be sent to your email address. Download it and select it after clicking "Add licence..." button on Via. Then, click "Close."

8. Via will open.
