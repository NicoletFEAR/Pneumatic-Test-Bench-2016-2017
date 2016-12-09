package org.usfirst.frc.team4786.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//port for compressor
	public static final int compressorPort = 0;
	
	//ports for double solenoids
	public static final int solenoidOneForwardPort = 0;
	public static final int solenoidOneReverseport = 0;
	public static final int solenoidTwoForwardPort = 0;
	public static final int solenoidTwoReversePort = 0;
	
	//ports for reed switches
	//wired so that true means activated
	public static final int pistonOneExtendedReedSwitchPort = 0;
	public static final int pistonTwoExtendedReedSwitchPort = 0;
	public static final int pistonOneRetractedReedSwitchPort = 0;
	public static final int pistonTwoRetractedReedSwitchPort = 0;

	
	//volume values for pistons
	public static final int pistonOneVolumeOut = 0;
	public static final int pistonOneVolumeIn = 0;
	public static final int pistonTwoVolumeOut = 0;
	public static final int pistonTwoVolumeIn = 0;
	
	//Logtech joystick
	public static final int Trigger = 1;
	public static final int JoyUp = 3;
	public static final int JoyDown = 2;
	
	
	//xbox controller
	public static final int A = 1;
	public static final int B = 2;
	public static final int X = 3;
	public static final int Y = 4;
	public static final int LeftBump = 5;
	public static final int RightBump = 6;
	public static final int Back = 7;
	public static final int Start = 8;
	public static final int LeftStick = 9;
	public static final int RightStick = 10;
	public static final int leftControlStickX = 0;
    public static final int leftControlStickY = 1;
    public static final int rightControlStickX = 4;
    public static final int rightControlStickY = 5;
	
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
