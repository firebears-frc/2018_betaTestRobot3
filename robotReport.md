# betaTestRobot3, as of 2017.12.23

roboRIO serial number: 030a4a34

Command-based robot example, with dependency injection.

## CAN

* 2 = frontLeft : CANTalon(2,Chassis,frontLeft)
* 3 = frontRight : CANTalon(3,Chassis,frontRight)
* 4 = rearLeft : CANTalon(4,Chassis,rearLeft)
* 5 = rearRight : CANTalon(5,Chassis,rearRight)
* 11 = climberMotor : CANTalon(11,Climber,climberMotor)

## Joysticks

* 0 = joystick : edu.wpi.first.wpilibj.Joystick@f1e4fa
    * 7 = climb up : ClimbUpCommand
    * 9 = climb down : ClimbDownCommand

