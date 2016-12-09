package org.usfirst.frc.team4786.robot.subsystems;

import org.usfirst.frc.team4786.robot.OI;
import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticPistonOne extends Subsystem {
    DoubleSolenoid pistonOne;

    
    public PneumaticPistonOne(){
    	 pistonOne = new DoubleSolenoid(RobotMap.solenoidOneForwardPort,RobotMap.solenoidOneReverseport);
    }
    public void extendPiston(){
    	pistonOne.set(DoubleSolenoid.Value.kForward);
    }
    public void retractPiston(){
    	pistonOne.set(DoubleSolenoid.Value.kReverse);
    }
    public void stopPiston(){
    	pistonOne.set(DoubleSolenoid.Value.kOff);
    }
    public boolean isExtended(){
    	return OI.pistonOneExtendedReedSwitch.get();
    	//returns true when activated
    }
    public boolean isRetracted(){
    	return OI.pistonOneRetractedReedSwitch.get();
    	//returns true when activated
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

