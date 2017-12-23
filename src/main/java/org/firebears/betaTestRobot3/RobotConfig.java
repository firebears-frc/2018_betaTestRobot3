package org.firebears.betaTestRobot3;

import java.io.File;

import org.firebears.betaTestRobot3.commands.ClimbDownCommand;
import org.firebears.betaTestRobot3.commands.ClimbUpCommand;
import org.firebears.betaTestRobot3.commands.DriveCommand;
import org.firebears.betaTestRobot3.commands.DriveForwardCommand;
import org.firebears.betaTestRobot3.subsystems.Chassis;
import org.firebears.betaTestRobot3.subsystems.Climber;
import org.firebears.util.CANTalon;
import org.firebears.util.RobotReport;

import com.ctre.phoenix.MotorControl.ControlMode;
import com.ctre.phoenix.MotorControl.FeedbackDevice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Configures all components required by subsystems.
 */
public class RobotConfig {

	public static final boolean DEBUG = true;
	
	public static final int CAN_FRONT_LEFT = 2;
	public static final int CAN_REAR_LEFT = 4;
	public static final int CAN_FRONT_RIGHT = 3;
	public static final int CAN_REAR_RIGHT = 5;
	public static final int CAN_CLIMBER = 11;
	public static final boolean CHASSIS_BRAKE_MODE = true;

	static final double PID_P = 3.0f;
	static final double PID_I = 0;
	static final double PID_D = 0;
	static final double PID_FF = 0;
	static final int PID_IZONE = 256;
	static final double PID_RAMPRATE = 1;
	static final int PID_PROFILE = 0;
	static final int ENCODER_COUNTS_PER_REV = 255;

	public final CANTalon frontLeftMotor;
	public final CANTalon rearLeftMotor;
	public final CANTalon frontRightMotor;
	public final CANTalon rearRightMotor;
	public final CANTalon climberMotor;

	public final Joystick joystick;

	public Chassis chassis;
	public Climber climber;

	public RobotReport report;

	/**
	 * Construct RobotConfig. Create all low-level components to support the robot.
	 */
	public RobotConfig() {
		report = new RobotReport("betaTestRobot3");
		report.setDescription("Command-based robot example, with dependency injection.");

		frontLeftMotor = new CANTalon(CAN_FRONT_LEFT);
		frontLeftMotor.changeControlMode(ControlMode.Velocity);
		frontLeftMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		frontLeftMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		frontLeftMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		frontLeftMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		frontLeftMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		frontLeftMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		frontLeftMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		frontLeftMotor.enable();
		frontLeftMotor.setName("Chassis", "frontLeft");
		LiveWindow.add(frontLeftMotor);
		report.addCAN(CAN_FRONT_LEFT, "frontLeft", frontLeftMotor);

		rearLeftMotor = new CANTalon(CAN_REAR_LEFT);
		rearLeftMotor.changeControlMode(ControlMode.Velocity);
		rearLeftMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		rearLeftMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		rearLeftMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		rearLeftMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		rearLeftMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		rearLeftMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		rearLeftMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		rearLeftMotor.enable();
		rearLeftMotor.setName("Chassis", "rearLeft");
		LiveWindow.add(rearLeftMotor);
		report.addCAN(CAN_REAR_LEFT, "rearLeft", rearLeftMotor);

		frontRightMotor = new CANTalon(CAN_FRONT_RIGHT);
		frontRightMotor.changeControlMode(ControlMode.Velocity);
		frontRightMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		frontRightMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		frontRightMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		frontRightMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		frontRightMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		frontRightMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		frontRightMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		frontRightMotor.enable();
		frontRightMotor.setName("Chassis", "frontRight");
		LiveWindow.add(frontRightMotor);
		report.addCAN(CAN_FRONT_RIGHT, "frontRight", frontRightMotor);

		rearRightMotor = new CANTalon(CAN_REAR_RIGHT);
		rearRightMotor.changeControlMode(ControlMode.Velocity);
		rearRightMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		rearRightMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		rearRightMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		rearRightMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		rearRightMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		rearRightMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		rearRightMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		rearRightMotor.enable();
		rearRightMotor.setName("Chassis", "rearRight");
		LiveWindow.add(rearRightMotor);
		report.addCAN(CAN_REAR_RIGHT, "rearRight", rearRightMotor);

		climberMotor = new CANTalon(CAN_CLIMBER);
		climberMotor.setName("Climber", "climberMotor");
		LiveWindow.add(climberMotor);
		report.addCAN(CAN_CLIMBER, "climberMotor", climberMotor);

		joystick = new Joystick(0);
		report.addJoystick(0, "joystick", joystick);
	}

	/**
	 * Perform initializations of high-level components.
	 */
	public void init() {
		initializeSubsystems();
		initializeOperatorInterface();

		chassis.setDefaultCommand(new DriveCommand(chassis, joystick));

		report.write(new File(System.getProperty("user.home"), "robotReport.md"), DEBUG);
	}

	/**
	 * Initialize high-level robot subsystems.
	 */
	protected void initializeSubsystems() {
		chassis = new Chassis(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		climber = new Climber(climberMotor);
	}

	/**
	 * Initializes high-level components and attaches new Commands to Joystick
	 * buttons and Triggers. Also may put Commands on the SmartDashboard.
	 */
	protected void initializeOperatorInterface() {
		JoystickButton upButton = new JoystickButton(joystick, 7);
		Command upCommand = new ClimbUpCommand(climber);
		upButton.whileHeld(upCommand);
		report.addJoystickButton(0, 7, "climb up", upCommand);

		JoystickButton downButton = new JoystickButton(joystick, 9);
		Command downCommand = new ClimbDownCommand(climber);
		downButton.whileHeld(downCommand);
		report.addJoystickButton(0, 9, "climb down", downCommand);
	}

	/**
	 * Determine the current autonomous Command.
	 * 
	 * @return Command for autonomous mode, or {@code null}.
	 */
	public Command getAutonomousCommand() {
		return new DriveForwardCommand(chassis);
	}
}
