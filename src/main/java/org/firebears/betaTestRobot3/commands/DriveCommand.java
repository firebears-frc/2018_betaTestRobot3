package org.firebears.betaTestRobot3.commands;

import org.firebears.betaTestRobot3.subsystems.Chassis;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {

	private final Chassis chassis;
	private final Joystick joystick;

	public DriveCommand(Chassis chassis, Joystick joystick) {
		this.chassis = chassis;
		this.joystick = joystick;
		requires(this.chassis);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void execute() {
		double x = joystick.getX();
		double y = joystick.getY();
		double rotation = joystick.getTwist();
		chassis.drive(x, y, rotation);
	}
}
