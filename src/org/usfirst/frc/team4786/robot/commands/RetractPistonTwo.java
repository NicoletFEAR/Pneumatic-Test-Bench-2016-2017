package org.usfirst.frc.team4786.robot.commands;

import org.usfirst.frc.team4786.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RetractPistonTwo extends Command {

    public RetractPistonTwo() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pneumaticPistonTwo);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.pneumaticPistonTwo.retractPiston();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.pneumaticPistonTwo.isRetracted();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pneumaticPistonTwo.stopPiston();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.pneumaticPistonTwo.stopPiston();
    }
}