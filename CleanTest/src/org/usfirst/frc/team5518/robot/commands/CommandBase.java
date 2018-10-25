package org.usfirst.frc.team5518.robot.commands;

import org.usfirst.frc.team5518.robot.subsystems.DriveBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Provides an area in which to initialize all subsystems for easy calling
 */
public abstract class CommandBase extends Command {

    public static DriveBase driveBase;
    
    public static void init() {
    		driveBase = new DriveBase();
    }
    
}
