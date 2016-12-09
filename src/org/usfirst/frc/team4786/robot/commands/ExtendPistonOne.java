package org.usfirst.frc.team4786.robot.commands;

import org.usfirst.frc.team4786.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendPistonOne extends Command {

    public ExtendPistonOne() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.pneumaticPistonOne.extendPiston();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.pneumaticPistonOne.isExtended();
    	//stops the command once the piston is extended
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pneumaticPistonOne.stopPiston();
    	//stops the piston just to be safe
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
