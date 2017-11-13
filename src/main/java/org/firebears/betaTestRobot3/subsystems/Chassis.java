package org.firebears.betaTestRobot3.subsystems;

import org.firebears.betaTestRobot3.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Chassis extends Subsystem {

	private final MecanumDrive robotDrive;
	private Joystick joystick = null;
	private DriveCommand defaultCommand = null;

	public Chassis(SpeedController frontLeftMotor, SpeedController rearLeftMotor, SpeedController frontRightMotor,
			SpeedController rearRightMotor) {
		robotDrive = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	}

	@Override
	protected void initDefaultCommand() {
		defaultCommand = new DriveCommand(this);
		if (joystick != null) {
			defaultCommand.setJoystick(joystick);
		}
		setDefaultCommand(defaultCommand);
	}

	public void drive(double x, double y, double rotation) {
		robotDrive.driveCartesian(x, y, rotation);
	}

	public void stop() {
		drive(0.0, 0.0, 0.0);
	}

	/**
	 * Set the joystick that will control driving.
	 */
	public void setJoystick(Joystick joystick) {
		this.joystick = joystick;
		if (defaultCommand != null) {
			defaultCommand.setJoystick(joystick);
		}
	}
}
