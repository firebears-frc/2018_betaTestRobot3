# betaTestRobot3
Command based robot.

Unlike the RobotBuilder template, this project has no static object variables.
The intention is to be more like a dependency-injection architecture, but without adding
any dependency injection JAR files.  This pattern could also be used with C++ robots.

For each subsystem, the low-level dependencies are injected as constructor parameters, and 
are then saved as final instance variables.  For instance, the ``Chassis`` subsystem depends
on four ``SpeedController`` components.

For each command, the required subsystems are injected as constructor parameters.
For instance, the ``DriveCommand`` and ``DriveForwardCommand``  each require control of 
the ``Chassis`` subsystem, so their constructors both take the Chassis as a parameter.

This formulation can be build from Eclipse with ant, or also with GradleRIO.
