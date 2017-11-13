package org.firebears.betaTestRobot3.commands;

import org.firebears.betaTestRobot3.subsystems.Chassis;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {

	private final Chassis chassis;
	private Joystick joystick = null;

	public DriveCommand(Chassis chassis) {
		this.chassis = chassis;
		requires(this.chassis);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void execute() {
		assert joystick!=null : "You must set the joystick in initialization";
		double x = joystick.getX();
		double y = joystick.getY();
		double rotation = joystick.getTwist();
		chassis.drive(x, y, rotation);
	}
	
	/**
	 * Set the joystick that will control driving.
	 */
	public void setJoystick(Joystick joystick) {
		this.joystick = joystick;
	}

}
