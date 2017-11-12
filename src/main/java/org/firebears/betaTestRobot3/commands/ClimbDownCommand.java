package org.firebears.betaTestRobot3.commands;

import org.firebears.betaTestRobot3.subsystems.Climber;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbDownCommand extends Command {

	private final Climber climber;

	public ClimbDownCommand(Climber climber) {
		this.climber = climber;
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		climber.stop();
	}

	@Override
	protected void execute() {
		climber.climbDown();
	}

}
