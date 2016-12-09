package org.usfirst.frc.team4786.robot.subsystems;

import org.usfirst.frc.team4786.robot.OI;
import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticPistonTwo extends Subsystem {
DoubleSolenoid pistonTwo;
    
    public PneumaticPistonTwo(){
    	 pistonTwo = new DoubleSolenoid(RobotMap.solenoidTwoForwardPort,RobotMap.solenoidTwoReversePort);
    }
    public void extendPiston(){
    	pistonTwo.set(DoubleSolenoid.Value.kForward);
    }
    public void retractPiston(){
    	pistonTwo.set(DoubleSolenoid.Value.kReverse);
    }
    public void stopPiston(){
    	pistonTwo.set(DoubleSolenoid.Value.kOff);
    }
    public boolean isExtended(){
    	return OI.pistonTwoExtendedReedSwitch.get();
    	//returns true when activated
    }
    public boolean isRetracted(){
    	return OI.pistonTwoRetractedReedSwitch.get();
    	//returns true when activated
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

