package org.firebears.betaTestRobot3.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {

	private final SpeedController climberMotor;

	public Climber(SpeedController motor) {
		this.climberMotor = motor;
	}

	@Override
	protected void initDefaultCommand() {
	}

	public void climbUp() {
		climberMotor.set(-1);
	}

	public void climbDown() {
		climberMotor.set(1);
	}

	public void stop() {
		climberMotor.set(0);
	}
}
