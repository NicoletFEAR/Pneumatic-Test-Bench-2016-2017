package org.usfirst.frc.team4786.robot;

import org.usfirst.frc.team4786.robot.commands.ExtendPistonOne;
import org.usfirst.frc.team4786.robot.commands.ExtendPistonTwo;
import org.usfirst.frc.team4786.robot.commands.RetractPistonOne;
import org.usfirst.frc.team4786.robot.commands.RetractPistonTwo;
import org.usfirst.frc.team4786.robot.commands.StopCompressor;
import org.usfirst.frc.team4786.robot.commands.StopPistonOne;
import org.usfirst.frc.team4786.robot.commands.StopPistonTwo;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static Joystick xboxController;
    public static Button aButton;
    public static Button bButton;
    public static Button xButton;
    public static Button yButton;
    public static Button rightBumper;
    public static Button leftBumper;
    public static Button start;
    public static DigitalInput pistonOneExtendedReedSwitch;
    public static DigitalInput pistonTwoExtendedReedSwitch;
    public static DigitalInput pistonOneRetractedReedSwitch;
    public static DigitalInput pistonTwoRetractedReedSwitch;
    
    public OI(){
    	pistonOneExtendedReedSwitch = new DigitalInput(RobotMap.pistonOneExtendedReedSwitchPort);
    	pistonTwoExtendedReedSwitch = new DigitalInput(RobotMap.pistonTwoExtendedReedSwitchPort);
    	pistonOneRetractedReedSwitch = new DigitalInput(RobotMap.pistonOneRetractedReedSwitchPort);
    	pistonTwoRetractedReedSwitch = new DigitalInput(RobotMap.pistonTwoRetractedReedSwitchPort);
    	
    	xboxController = new Joystick(2);
    	aButton = new JoystickButton(xboxController , RobotMap.A);
    	bButton = new JoystickButton(xboxController , RobotMap.B);
    	yButton = new JoystickButton(xboxController , RobotMap.Y);
    	xButton = new JoystickButton(xboxController , RobotMap.X);
    	rightBumper = new JoystickButton(xboxController , RobotMap.RightBump);
    	leftBumper = new JoystickButton(xboxController , RobotMap.LeftBump);
    	start = new JoystickButton(xboxController , RobotMap.Start);
    	
    	   //a extends piston 1;
        //b retracts piston 1
        //left bumper stops piston 1
        
        //x extends piston 2
        //y retracts piston 2
        //right bumper stops piston 2
        
        //start turns off compressor
        aButton.whenPressed(new ExtendPistonOne());
        bButton.whenPressed(new RetractPistonOne());
        yButton.whenPressed(new RetractPistonTwo());
        xButton.whenPressed(new ExtendPistonTwo());
        rightBumper.whenPressed(new StopPistonTwo());
        leftBumper.whenPressed(new StopPistonOne());
        start.whenPressed(new StopCompressor());
    }
    
    
    
    
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

