package org.usfirst.frc.team5518.robot.commands;

import org.usfirst.frc.team5518.robot.OI;
import org.usfirst.frc.team5518.robot.RobotMap;

/**
 * Controls tank drive
 */
public class Drive extends CommandBase {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        requires(driveBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double left = OI.getDriveJoystick().getRawAxis(RobotMap.XBOX_LSTICKY);
    		double right = OI.getDriveJoystick().getRawAxis(RobotMap.XBOX_RSTICKY);
    		left = Math.pow(left, 3);
    		right = Math.pow(right, 3);
    		driveBase.tankDrive(left, right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
