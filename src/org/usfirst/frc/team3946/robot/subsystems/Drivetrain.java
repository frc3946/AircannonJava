package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

	WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.frontLeftMotor);
	WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.frontLeftMotor);
	WPI_TalonSRX backLeft = new WPI_TalonSRX(RobotMap.frontLeftMotor);
	WPI_TalonSRX backRight = new WPI_TalonSRX(RobotMap.frontLeftMotor);
	
	DifferentialDrive robotDrive = new DifferentialDrive(frontLeft, frontRight);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void tankDrive(double leftSpeed, double rightSpeed) {
		
		robotDrive.tankDrive(leftSpeed, rightSpeed);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TankDrive());
    }
}

