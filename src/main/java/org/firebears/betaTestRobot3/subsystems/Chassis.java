package org.firebears.betaTestRobot3.subsystems;

import org.firebears.betaTestRobot3.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Chassis extends Subsystem {

	private final MecanumDrive robotDrive;
	private final Joystick joystick;

	public Chassis(Joystick joystick, SpeedController frontLeftMotor, SpeedController rearLeftMotor,
			SpeedController frontRightMotor, SpeedController rearRightMotor) {
		this.joystick = joystick;
		robotDrive = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand(joystick, this));
	}

	public void drive(double x, double y, double rotation) {
		robotDrive.driveCartesian(x, y, rotation);
	}

	public void stop() {
		drive(0.0, 0.0, 0.0);
	}
}
