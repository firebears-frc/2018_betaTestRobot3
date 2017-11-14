package org.firebears.betaTestRobot3.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Chassis extends Subsystem {

	private final MecanumDrive robotDrive;

	public Chassis(SpeedController frontLeftMotor, SpeedController rearLeftMotor, SpeedController frontRightMotor,
			SpeedController rearRightMotor) {
		robotDrive = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	}

	@Override
	protected void initDefaultCommand() {
	}

	@Override
	public void setDefaultCommand(Command command) {
		super.setDefaultCommand(command);
	}

	public void drive(double x, double y, double rotation) {
		robotDrive.driveCartesian(x, y, rotation);
	}

	public void stop() {
		drive(0.0, 0.0, 0.0);
	}
}
