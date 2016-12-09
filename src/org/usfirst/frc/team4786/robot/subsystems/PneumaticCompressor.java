package org.usfirst.frc.team4786.robot.subsystems;

import org.usfirst.frc.team4786.robot.RobotMap;
import org.usfirst.frc.team4786.robot.commands.CompressorAutoRun;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticCompressor extends Subsystem {
    public Compressor onboardCompressor = new Compressor(RobotMap.compressorPort);
    public PneumaticCompressor(){
    	
    }
    
    public boolean checkIfLow(){
    	if(onboardCompressor.getPressureSwitchValue() == true){
    		return true;
    	}else{
    		return false;
    	}
    }
    public boolean checkifTooHigh(){
    	return false;
    	//once I figure out how to directly get the pressure I will further implement this
    }
    public void turnOnCompressor(){
    	onboardCompressor.start();
    }
    public void turnOffCompressor(){
    	onboardCompressor.stop();
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new CompressorAutoRun());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

