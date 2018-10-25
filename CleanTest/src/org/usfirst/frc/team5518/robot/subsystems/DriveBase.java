package org.usfirst.frc.team5518.robot.subsystems;

import org.usfirst.frc.team5518.robot.RobotMap;
import org.usfirst.frc.team5518.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveBase extends Subsystem {

    WPI_TalonSRX leftRearMotor = new WPI_TalonSRX(RobotMap.LEFT_REAR_MOTOR);
    WPI_TalonSRX rightRearMotor = new WPI_TalonSRX(RobotMap.RIGHT_REAR_MOTOR);
    WPI_TalonSRX leftFrontMotor = new WPI_TalonSRX(RobotMap.LEFT_FRONT_MOTOR);
    WPI_TalonSRX rightFrontMotor = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_MOTOR);
    	
    ADXRS450_Gyro gyro = new ADXRS450_Gyro(Port.kOnboardCS0);
    
    SpeedControllerGroup left = new SpeedControllerGroup(leftRearMotor, leftFrontMotor);
    SpeedControllerGroup right = new SpeedControllerGroup(rightRearMotor, rightFrontMotor);
    
    DifferentialDrive robotDrive = new DifferentialDrive(left, right);
    
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) {
    		robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed, boolean highSpeed) {
		if (highSpeed)
    			robotDrive.tankDrive(leftSpeed, rightSpeed);
		else
			robotDrive.tankDrive(leftSpeed * 0.5, rightSpeed * 0.5);
    }
    
}







