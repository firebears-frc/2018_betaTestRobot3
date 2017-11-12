package org.firebears.betaTestRobot3;

import org.firebears.betaTestRobot3.subsystems.Chassis;
import org.firebears.betaTestRobot3.subsystems.Climber;
import org.firebears.util.CANTalon;
import org.firebears.util.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Configures all components required by subsystems.
 */
public class RobotConfig {

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
	static final double PID_RAMPRATE = 10;
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

	public RobotConfig() {
		frontLeftMotor = new CANTalon(CAN_FRONT_LEFT);
		frontLeftMotor.changeControlMode(CANTalon.TalonControlMode.Speed);
		frontLeftMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		frontLeftMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		frontLeftMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		frontLeftMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		frontLeftMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		frontLeftMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		frontLeftMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		frontLeftMotor.enable();
		LiveWindow.addActuator("Chassis", "frontLeft", frontLeftMotor);

		rearLeftMotor = new CANTalon(CAN_REAR_LEFT);
		rearLeftMotor.changeControlMode(CANTalon.TalonControlMode.Speed);
		rearLeftMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		rearLeftMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		rearLeftMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		rearLeftMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		rearLeftMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		rearLeftMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		rearLeftMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		rearLeftMotor.enable();
		LiveWindow.addActuator("Chassis", "rearLeft", rearLeftMotor);

		frontRightMotor = new CANTalon(CAN_FRONT_RIGHT);
		frontRightMotor.changeControlMode(CANTalon.TalonControlMode.Speed);
		frontRightMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		frontRightMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		frontRightMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		frontRightMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		frontRightMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		frontRightMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		frontRightMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		frontRightMotor.enable();
		LiveWindow.addActuator("Chassis", "frontRight", frontRightMotor);

		rearRightMotor = new CANTalon(CAN_REAR_RIGHT);
		rearRightMotor.changeControlMode(CANTalon.TalonControlMode.Speed);
		rearRightMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);// is this covered above with the
		rearRightMotor.reverseSensor(false);// is this covered above with the sRX_PIDQuadratureEncoder1 ?????
		rearRightMotor.configNominalOutputVoltage(+0.0d, -0.0d);// Forward/reverse threshold
		rearRightMotor.configPeakOutputVoltage(+12.0d, -12.0d);
		rearRightMotor.setPID(PID_P, PID_I, PID_D, PID_FF, PID_IZONE, PID_RAMPRATE, PID_PROFILE);
		rearRightMotor.configEncoderCodesPerRev(ENCODER_COUNTS_PER_REV);//
		rearRightMotor.enableBrakeMode(CHASSIS_BRAKE_MODE);
		rearRightMotor.enable();
		LiveWindow.addActuator("Chassis", "rearRight", rearRightMotor);

		climberMotor = new CANTalon(CAN_CLIMBER);
		LiveWindow.addActuator("Climber", "climberMotor", climberMotor);

		joystick = new Joystick(0);

		chassis = new Chassis(joystick, frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		climber = new Climber(climberMotor);

	}

	/**
	 * Initialize high-level robot subsystems.
	 */
	public void initializeSubsystems() {

	}

	/**
	 * Initializes high-level components and attaches new Commands to Joystick
	 * buttons and Triggers. Also may put Commands on the SmartDashboard.
	 */
	public void initializeOperatorInterface() {

	}

	/**
	 * Determine the current autonomous Command.
	 * 
	 * @return Command for autonomous mode, or {@code null}.
	 */
	public Command getAutonomousCommand() {
		return null;
	}
}
